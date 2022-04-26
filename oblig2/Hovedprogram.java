import java.util.ArrayList;

public class Hovedprogram {
    public static void main(String[] args) {

        // Med an arraylist blir det lettere å printe ut all informasjonen senere. Ellers blir koden evig lang :(
        ArrayList<Resept> liste = new ArrayList<>();
        
        // LEGER
        Lege lege = new Lege("Ole"); // navn
        Lege lege2 = new Lege("Doffen"); // navn
        Spesialist spesialist = new Spesialist("Dole", "XxX"); // navn, kontrollID
        
        // LEGEMIDLER
        Narkotisk narkotisk = new Narkotisk("Antibiotica", 125, 500, 4); // navn, pris, virkestoff(mg), styrke
        Vanedannende vanedannende = new Vanedannende("Paracet", 100, 250, 8); // navn, pris, virkestoff(mg), styrke
        VanligLegemiddel vanligLegemiddel = new VanligLegemiddel("ibux", 300, 120); // navn, pris, virkestoff
        
        // RESEPTER
        HviteResepter hviteResepter = new HviteResepter(narkotisk, lege, 1, 5); // legemiddel, lege, pasientID, reit
        MilResept milResept = new MilResept(vanedannende, lege2, 2); // legemiddel, lege, pasientID
        pResept presept = new pResept(vanligLegemiddel, lege2, 3, 10); // legemiddel, lege, pasientID, reit
        BlaaResepter blaaResepter = new BlaaResepter(narkotisk, spesialist, 4, 2); // legemiddel, lege, pasientID, reit

        liste.add(hviteResepter); // putter objektet i arraylista
        liste.add(milResept); // putter objektet i arraylista
        liste.add(presept); // putter objektet i arraylista
        liste.add(blaaResepter); // putter objektet i arraylista

        System.out.println("Lege-klasse");
        System.out.println("------------------------");
        for (Resept r : liste){
            System.out.println(r.hentLege());
            System.out.println("------------------------");
        }

        System.out.println();
        System.out.println();

        System.out.println("Legemiddel-klasse");
        System.out.println("------------------------");
        for (Resept r : liste){
            System.out.println(r.hentLegemiddel());
            System.out.println(r.getClass()); // på terminalen printer den ut hvilken klasse objektet tilhører (getClass();)
            System.out.println("------------------------");
        }

        System.out.println();
        System.out.println();

        System.out.println("Resept-klasse");
        System.out.println("------------------------");
        for (Resept r : liste){
            System.out.println(r.toString());
            System.out.println(r.getClass()); // på terminalen printer den ut hvilken klasse objektet tilhører (getClass();)
            System.out.println("------------------------");
        }

        



    }
}