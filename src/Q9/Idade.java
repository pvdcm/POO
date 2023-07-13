package Q9;


/*
      * ESSA CLASSE BASICAMENTE SERVE PARA ARMAZENAR A IDADE E REALIZAR ALGUNS CÁLCULOS REFERENTES A IDADE
      * DA PESSOA QUE IRÁ ENTRAR NO CINEMA
      *
      * DE UMA FORMA MAIS SIMPLIFICADA A IDADE É CÁLCULADA COM BASE EM ( 2023 - ANO ) É SIMPLES MAIS FUNCIONA
*/


public class Idade
{
      int dia;
      int mes;
      int ano;
      
      Idade ( int dia , int mes , int ano )
      {
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
      }
      
      // 1ª
      public boolean Anos12 () { if ( 2023 - this.ano < 12 ) { return true; } else return false; }
      
      // 2ª
      public boolean Anos_12_15 () { if ( ( 2023 - this.ano >= 12 && 2023 - this.ano <= 15 ) ) { return true; } else return false; }
      public boolean Anos_16_20 () { if ( ( 2023 - this.ano >= 16 && 2023 - this.ano <= 20 ) ) { return true; } else return false; }
      public boolean AnosPlus () { if ( ( 2023 - this.ano > 20 ) ) { return true; } else return false; }
}
