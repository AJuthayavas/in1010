public class Aapning extends HvitRute {

     public Aapning(int radNummer, int kolonneNummer, Labyrint lab){
          super(radNummer, kolonneNummer, lab);
     }


     @Override
     public String toString() {
          return "(Åpning: " + radNummer + "," + kolonneNummer + " ." + ")";
          //return "(" + "Sort rute: " + radNummer + "," + kolonneNummer + ")";
          //return "(" + "Sort rute: " + radNummer + "," + kolonneNummer + " tilhører labyrint: " +  lab + ")";
     }
}
