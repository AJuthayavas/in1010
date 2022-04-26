//------------------------------------------------START-KLASSE-LEGE------------------------------------------------
public class Lege {

    public String navn;

    public Lege(String navn){
        this.navn = navn;
        //System.out.println("//Klasse Lege Opprettet.");
    }

    public String hentNavn(){
        return navn;
    }

    public String toString(){
        return (navn);
    }
    
}


//------------------------------------------------START-KLASSE-SPESIALIST------------------------------------------------


class Spesialist extends Lege implements Godkjenningsfritak{

    protected String kontrollID;

    public Spesialist(String navn, String kontrollID){
        super(navn);
        this.kontrollID = kontrollID;
        //System.out.println("//Klasse spesialist opprettet.");
    }

    public String hentNavn(){
        return navn;
    }

    public String hentKontrollID(){
        return kontrollID;
    }

    public String toString(){
        return (navn + "\n" +
                "KontrollID: " + kontrollID);
    }


}


//------------------------------------------------END-OF-CODE------------------------------------------------