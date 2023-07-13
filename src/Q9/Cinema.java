package Q9;
import java.util.Scanner;

public class Cinema
{
      Idade cineD = new Idade ( 17 , 3 , 2023 );
      Idade pessoa = new Idade ( 0 , 0 , 0 );
      EntradaDeCinema cine = new EntradaDeCinema ( cineD , 14 , 5 , 167.35 );
      Scanner input = new Scanner ( System.in );
      char answer;
      int set;
      double set2;
      
      public void run () throws InterruptedException
      {
            do
            {

              
              System.out.println (" [ CINEMA PLACE OF NOWHERE ]");
            
              System.out.println ();
              System.out.println (" * Executar Teste Rápido ou fazer manualmente? ");
              System.out.println ();
            
              System.out.println ("  Y / y - Sim");
              System.out.println ("  N / n - Não ( Printa o Bilhete Atual, quando alterado tbm )");
              System.out.println ("  R / r - Voltar para o menu");
              
              System.out.println ();
                  
              try
              {
                 System.out.print (" * Sua escolha: ");
                 answer = input . nextLine () . charAt ( 0 );
              }
              catch ( Exception StringIndexOutOfBoundsException )
              {
                   continue;
              }
              
              switch ( answer )
              {
                    case 'Y' , 'y' ->
                    {

                        
                        System.out.println ();
                        System.out.println (" # MENU DA ADMINISTRAÇÃO #");
                        System.out.println ();
                        
                        /* DATA DO FILME */
                        System.out.println (" * Qual é a data do filme?");
                        
                        // Dia.
                        do
                        {
                          System.out.print   ("   Dia: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 || set >= 32 );
                        this.cine.data.dia = set;

                        // Mês.
                        do
                        {
                          System.out.print   ("   Mês: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 || set >= 13 );
                        this.cine.data.mes = set;

                        // Ano.
                        do
                        {
                          System.out.print   ("   Ano: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 );
                        this.cine.data.ano = set;
                        
                        System.out.println ();
                        
                        /* HORA DO FILME */
                        do
                        {
                          System.out.print (" * Qual é a hora do filme?: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set < 0 || set >= 25 );
                        this.cine.hora = set;
                        
                        System.out.println ();
                        
                        /* SALA DO FILME */
                        do
                        {
                          System.out.print (" * Qual é a sala do filme? ( 1 , 2 , 3 ... ): ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set < 0 );
                        this.cine.sala = set;
                        
                        System.out.println ();
                        
                        /* PREÇO DO INGRESSO */
                        do
                        {
                          System.out.print (" * Qual é o preço do ingresso?: ");
                          try { set2 = input.nextDouble (); }
                          catch ( Exception InputMismatchException ) { set2 = 0; }
                          input.nextLine ();
                        }
                        while ( set2 <= 0 );
                        this.cine.valor = set2;
                        
                        System.out.println ();
                        System.out.println ();
                        System.out.println (" # AUTOATENDIMENTO #");
                        System.out.println ();
                        
                        
                        /* DATA DE NASCIMENTO */
                        System.out.println (" * Qual é sua data de nascimento?");
                          
                        // Dia.
                        do
                        {
                          System.out.print   ("   Dia: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 || set >= 32 );
                        pessoa.dia = set;
                          
                        // Mês.
                        do
                        {
                          System.out.print   ("   Mês: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 || set >= 13 );
                        pessoa.mes = set;
                          
                        // Ano.
                        do
                        {
                          System.out.print   ("   Ano: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set <= 0 );
                        pessoa.ano = set;
                          
                        System.out.println ();
            
                        System.out.println (" * Aviso.: Caso não possua uma carteira de estudante digite 0");
                        System.out.println ();
                        // Carteira.
                        do
                        {
                          System.out.print   (" * Carteira de Estudante: ");
                          try { set = input.nextInt (); }
                          catch ( Exception InputMismatchException ) { set = 0; }
                          input.nextLine ();
                        }
                        while ( set < 0 );
                        
                        
                        /* MODIFICAÇÕES FINAIS */
                        cine.CalculaDesconto ( pessoa );
                        cine.CalculaDesconto ( pessoa , set );
                        cine.CalculaDescontoHorario ( cine.hora );

                        System.out.println ();
                        System.out.println ( this.cine.toString () );
                        System.out.println ();
                        
                        System.out.print (" * Pressione Enter para continuar...");
                        input.nextLine ();
                    }
                    
                    case 'N' , 'n' ->
                    {
                        System.out.println ();
                        System.out.println ( this.cine.toString () );
                        System.out.println ();
                  
                        System.out.print (" * Pressione Enter para continuar...");
                        input.nextLine ();
                    }
              }
              
              if ( answer == 'R' || answer == 'r' ) break;
              
            }
            while ( true );
            System.out.println (" * Voltando ao menu principal...");
            Thread.sleep ( 2000 );
      }
}
