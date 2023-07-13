package Q4;

import java.util.Scanner;

class Veiculo {
    protected String cor;
    protected int Pot;
    protected int anoFabri;
    protected double valor;

    public Veiculo(String cor, int Pot, int anoFabri, double valor) {
        this.cor = cor;
        this.Pot = Pot;
        this.anoFabri = anoFabri;
        this.valor = valor;
    }
}

class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String cor, int Pot, int anoFabri, double valor, int cilindradas) {
        super(cor, Pot, anoFabri, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String cor, int Pot, int anoFabri, double valor, int portas) {
        super(cor, Pot, anoFabri, valor);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
}

class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String cor, int Pot, int anoFabri, double valor, int capacidadeCarga) {
        super(cor, Pot, anoFabri, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
}

public class Vrum {
    static Scanner scan = new Scanner(System.in);
    public static void vrum() {
        // Criando objetos para testar as classes
        Motocicleta moto = new Motocicleta("Vermelha", 250, 2022, 15000.0, 500);
        Carro carro = new Carro("Preto", 150, 2020, 50000.0, 4);
        Caminhao caminhao = new Caminhao("Branco", 300, 2019, 100000.0, 10000);

        // Exibindo informações dos veículos
        System.out.println("Informações da Motocicleta:");
        System.out.println("Cor: " + moto.cor);
        System.out.println("Potência: " + moto.Pot);
        System.out.println("Ano de Fabricação: " + moto.anoFabri);
        System.out.println("Valor: " + moto.valor);
        System.out.println("Cilindradas: " + moto.getCilindradas());

        System.out.println();

        System.out.println("Informações do Carro:");
        System.out.println("Cor: " + carro.cor);
        System.out.println("Potência: " + carro.Pot);
        System.out.println("Ano de Fabricação: " + carro.anoFabri);
        System.out.println("Valor: " + carro.valor);
        System.out.println("Portas: " + carro.getPortas());

        System.out.println();

        System.out.println("Informações do Caminhão:");
        System.out.println("Cor: " + caminhao.cor);
        System.out.println("Potência: " + caminhao.Pot);
        System.out.println("Ano de Fabricação: " + caminhao.anoFabri);
        System.out.println("Valor: " + caminhao.valor);
        System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga());

        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }
}