package Q9;
import java.text.DecimalFormat;


/*
      * ESSA CLASSE POSSUI OS ATRIBUTOS E METÓDOS DE CHECAGEM DE DESCONTO REQUISITADOS PELA QUESTÃO 9
*/


public class EntradaDeCinema
{
      /* ATRIBUTOS */
      Idade data;
      int hora;
      int sala;
      double valor;
      
      /* CONSTRUTOR */
      EntradaDeCinema ( Idade data , int hora , int sala , double valor )
      {
                     this.data  = data;
                     this.hora  = hora;
                     this.sala  = sala;
                     this.valor = valor;
      }
      
      public int getAge () { return 2023 - data.ano; }
      
      /* MÉTODOS */
      public void CalculaDesconto ( Idade age )
      {
            double holder;
            if ( age.Anos12 () ) { holder = this.valor * 0.5; this.valor -= holder; }
      }
      
      public void CalculaDesconto ( Idade age , int carteira )
      {
              double holder;
              
              if      ( age.Anos_12_15 () && carteira != 0 ) { holder = this.valor * 0.4; this.valor -= holder; }
              else if ( age.Anos_16_20 () && carteira != 0 ) { holder = this.valor * 0.3; this.valor -= holder; }
              else if ( age.AnosPlus   () && carteira != 0 ) { holder = this.valor * 0.2; this.valor -= holder; }
      }
      
      public void CalculaDescontoHorario ( int horario )
      {
            double holder;
            
            if ( this.hora < 16 ) { holder = this.valor * 0.1; this.valor -= holder; }
      }
      
      @Override public String toString ()
      {
               String formData = String.format ( "%02d/%02d/%d" , this.data.dia , this.data.mes , this.data.ano );
               String formSala = String.format ( "%02d" , this.sala );
               DecimalFormat df = new DecimalFormat ("0.00");
               String formValo = df.format (  this.valor );
            
               return "  [ CINEMA PLACE OF NOWHERE ]\n\n" +
                      "  [*] Data do Filme:  " + formData + "\n" +
                      "  [+] Hora do Filme:  " + this.hora + "h\n" +
                      "  [*] Sala do Filme:  " + formSala + "\n" +
                      "  [-] Valor do Filme: " + "R$" + formValo;
      }
}
