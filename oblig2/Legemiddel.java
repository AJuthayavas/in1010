//------------------------------------------------START-KLASSE-LEGEMIDDEL------------------------------------------------
public abstract class Legemiddel {
    
    protected String navn;
    public static int legemiddelID;
    protected int idd;
    protected int pris;
    protected double virkestoff;

    public Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        legemiddelID++;
        idd += legemiddelID;
        //System.out.println("//Klasse Legemiddel Opprettet.");
    }

    public int hentID(){
        return idd;
    }

    public String hentNavn(){
        return navn;
    }

    public int hentPris(){
        return pris;
    }

    public double hentVirkestoff(){
        return virkestoff;
    }

    public void settNyPris(int nyPris){
        pris = nyPris;
    }

    @Override
    public abstract String toString();
}


//------------------------------------------------START-KLASSE-NARKOTISK------------------------------------------------


class Narkotisk extends Legemiddel{

    private int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke){
        super(navn, pris, virkestoff);
        this.styrke = styrke;
        //System.out.println("//Klasse Narkotisk Opprettet.");
    }

    public int hentNarkotiskStyrke(){
        return styrke;
    }

    public String toString(){
        return ("Legemiddel-ID: " + idd + "\n" +
                "Klasse: Narkotisk" + "\n" +
                "Navn: " + navn + "\n" +
                "Vanlig pris: " + pris + "kr." + "\n" +
                "Virkestoff: " + virkestoff + "mg." + "\n" +
                "Styrke: " + styrke);
    }

}


//------------------------------------------------START-KLASSE-VANEDANNENDE------------------------------------------------


class Vanedannende extends Legemiddel{

    private int styrke;

    public Vanedannende(String navn, int pris, double virkestoff, int styrke){
        super(navn, pris, virkestoff);
        this.styrke = styrke;
        //System.out.println("//Klasse Vanedannende Opprettet.");
    }

    public int hentVanedannendeStyrke(){
        return styrke;
    }

    public String toString(){
        return ("Legemiddel-ID: " + idd + "\n" +
                "Klasse: Vanedannende" + "\n" +
                "Navn: " + navn + "\n" +
                "Vanlig pris: " + pris + "kr." + "\n" +
                "Virkestoff: " + virkestoff + "mg." + "\n" +
                "Styrke: " + styrke);
    }

}


//------------------------------------------------START-KLASSE-VANLIG-LEGEMIDDEL------------------------------------------------


class VanligLegemiddel extends Legemiddel{

    public VanligLegemiddel(String navn, int pris, double virkestoff){
        super(navn, pris, virkestoff);
        //System.out.println("//Klasse Vanlig-Legemiddel Opprettet.");
    }

    public String toString(){
        return ("Legemiddel-ID: " + idd + "\n" +
                "Klasse: Vanlig Legemiddel" + "\n" +
                "Navn: " + navn + "\n" +
                "Vanlig pris: " + pris + "kr." + "\n" +
                "Virkestoff: " + virkestoff + "mg.");
    }

}


//------------------------------------------------END-OF-CODE------------------------------------------------