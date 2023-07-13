package Q5;

import java.util.Scanner;

class Datal {
    private int mes;
    private int dia;
    private int ano;

    public Datal(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibeData() {
        return dia + "/" + mes + "/" + ano;
    }
}

//Agora em outro arquivo faça

public class DATAF {

    static Scanner scan = new Scanner(System.in);
    public DATAF(){
        Datal data = new Datal(6, 22, 2023);

        System.out.println("Data: " + data.exibeData());

        data.setAno(2024);
        data.setMes(12);
        data.setDia(31);

        System.out.println("Nova Data: " + data.exibeData());
        System.out.print("\nAperter 'Enter' para continuar: ");
        scan.nextLine();
    }

}