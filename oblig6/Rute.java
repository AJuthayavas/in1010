//------------------------------------------------------------------RUTE------------------------------------------------------------------//
public abstract class Rute { // OPPRETTELSE AV OBJEKT AV KLASSE RUTE ER ULOVLIG, KUN SUBKLASSE!!!!
     int radNummer;
     int kolonneNummer;
     Labyrint lab;
     
     // referanse til naboer
     Rute naboRuteNord;
     Rute naboRuteSoer;
     Rute naboRuteOest;
     Rute naboRuteVest;
     Rute nabo;

     Rute fra;
     
     // konstruktør --> Koordinater (x, y)
     public Rute(int radNummer, int kolonneNummer, Labyrint lab){
          this.radNummer = radNummer;
          this.kolonneNummer = kolonneNummer;
          // referanse til nabo?
     }

     //public int hentRad(Rute rute){
     public int hentRadNummer(Rute rute){
          return radNummer;
     }

     //public int hentKolonne(Rute rute){
     public int hentKolonneNummer(Rute rute){
          return kolonneNummer;
     }

     public void finn(Rute fra){
          this.fra = fra;
     }

     public abstract char symbol();

     public String toString(){
          return "hei";
     }
}


//------------------------------------------------------------------HVIT-RUTE------------------------------------------------------------------//


class HvitRute extends Rute {

     public HvitRute(int radNummer, int kolonneNummer, Labyrint lab){
          super(radNummer, kolonneNummer, lab);
     }

     public boolean naboRute(Rute r){
          //
          

          return true; 
     }

     @Override
     public char symbol(){
          return '.';
     }





     @Override
     public String toString(){
          return "(Hvit rute: " + radNummer + "," + kolonneNummer + " ." + ")";
          //return "(" + "Hvit rute: " + radNummer + ", " + kolonneNummer + ")";
          //return "(" + "Hvit rute: " + radNummer + "," + kolonneNummer + " tilhører labyrint: " +  lab + ")";
     }
}


//------------------------------------------------------------------SORT-RUTE------------------------------------------------------------------//


class SortRute extends Rute {
     
     public SortRute(int radNummer, int kolonneNummer, Labyrint lab){
          super(radNummer, kolonneNummer, lab);
     }

     @Override
     public char symbol(){
          return '#';
     }





     @Override
     public String toString(){
          return "(Sort rute: " + radNummer + "," + kolonneNummer + " #" + ")";
          //return "(" + "Sort rute: " + radNummer + "," + kolonneNummer + ")";
          //return "(" + "Sort rute: " + radNummer + "," + kolonneNummer + " tilhører labyrint: " +  lab + ")";
     }
}
