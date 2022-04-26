public class Bilbruk3 {

    public static void main(String[] args) {
        Bil3 bilObjekt = new Bil3("FIASC 7");
        //testObjekt.skrivUt();

        //System.out.println();
        
        Person x = new Person(bilObjekt, "Test-Menneske");
        x.printUtNummeret();
    }
    
}
