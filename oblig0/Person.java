public class Person {

    private String navn;
    private Bil3 refererTilObjekt;

    public Person(Bil3 refererTilObjekt, String n){
        this.refererTilObjekt = refererTilObjekt;
        navn = n;
    }

    public void printUtNummeret(){
        String bilnummer = refererTilObjekt.hentNummer();
        System.out.println("Navnet mitt er " + navn + " og bilnummeret mitt er " + bilnummer + ".");
      }
    
}
