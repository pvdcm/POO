import Q1.Calc;
import Q2.Pess;
import Q3.Pess2;
import Q4.Vrum;
import Q5.DATAF;
import Q6.CardEnd;
import Q7.Bank;
import Q8.AltPais;
import Q9.Cinema;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static LocalTime locat = LocalTime.now();
    static int opc;
    static boolean sair = false;
    public static void main(String[]args) throws InterruptedException {

        do {


            System.out.print(
                    """
                            MENU
                            # Escolha
                                    
                            1 - CALCULA SHOW
                            2 - PESSOA LEGAL
                            3 - PESSOA LEGAL 2
                            4 - VRUUMMMM
                            5 - WHAT DIA it is
                            6 - Caderno ??
                            7 - BANCO 0-0
                            8 - PAIS BRASIL
                            9 - Cinema
                            0 - Para sair 
                                   
                    """
            );
            do {
                try {
                    System.out.print("=> ");
                    opc = scan.nextInt();
                }
                catch (Exception e){
                    opc = -1;
                }
            }
            while (opc <= -1 || opc >= 10);
            switch (opc) {
                case 1 -> new Calc().calc();
                case 2 -> new Pess().pess();
                case 3 -> new Pess2().pess2();
                case 4 -> new Vrum().vrum();
                case 5 -> new DATAF();
                case 6 -> new CardEnd().cardEnd();
                case 7 -> new Bank().bank();
                case 8 -> new AltPais().altPais();
                case 9 -> new Cinema().run();
                case 0 -> sair = true;
                }

            }while (!sair);
        scan.close();
        }
    }
