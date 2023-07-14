package Q1;

import java.util.Scanner;

abstract class Calculadora {
    public abstract double somar(double x, double y);
    public abstract double subtrair(double x, double y);
    public abstract double multiplicar(double x, double y);
    public abstract double dividir(double x, double y);
}

class CalculadoraCompleta extends Calculadora {
    @Override
    public double somar(double x, double y) {
        return x + y;
    }

    @Override
    public double subtrair(double x, double y) {
        return x - y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x * y;
    }

    @Override
    public double dividir(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Não é possivel realizar uma divisão por zero!");
        }
    }

    public double calcularRaizQuadrada(double x) {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            throw new ArithmeticException("A raiz quadrada de um número negativo não é possível!");
        }
    }

    public double calcularPotenciaAoQuadrado(double x) {
        return Math.pow(x, 2);
    }
}

// Classe principal para testar as classes
public class Calc {
    static Scanner scan = new Scanner(System.in);
    public void calc() {
        CalculadoraCompleta calculadora = new CalculadoraCompleta();

        double resultadoSoma = calculadora.somar(5, 3);
        double resultadoSubtracao = calculadora.subtrair(5, 3);
        double resultadoMultiplicacao = calculadora.multiplicar(5, 3);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        try {
            // Testando a divisão por zero
            double resultadoDivisao = calculadora.dividir(10, 2);
            System.out.println("Divisão: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testando as operações adicionais
        try {
            double resultadoRaizQuadrada = calculadora.calcularRaizQuadrada(16);
            System.out.println("Raiz quadrada: " + resultadoRaizQuadrada);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        double resultadoPotenciaAoQuadrado = calculadora.calcularPotenciaAoQuadrado(5);
        System.out.println("Potência ao quadrado: " + resultadoPotenciaAoQuadrado);

        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }
}