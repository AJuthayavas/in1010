public class testLegemiddel {
    public static void main(String[] args) {

        Narkotisk narko = new Narkotisk("Narkose", 25, 1250, 7);
        System.out.println("Objekt 1");
        System.out.println(narko instanceof Narkotisk); //true
        System.out.println();

        // Henter ID (1)
        if (narko.hentID() == 1){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter navn (2)
        if (narko.hentNavn() == "Narkose"){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter pris (3)
        if (narko.hentPris() == 25){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter virkestoff (4)
        if (narko.hentVirkestoff() == 1250){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter virkestoff (5)
        if (narko.hentNarkotiskStyrke() == 7){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        System.out.println(narko.toString());


        System.out.println();


        Vanedannende vaneda = new Vanedannende("Vanedannende", 30, 990, 3);
        System.out.println("---------------");
        System.out.println();
        System.out.println("Objekt 2");
        System.out.println(vaneda instanceof Vanedannende); //true
        System.out.println();

        // Henter ID (1)
        if (vaneda.hentID() == 2){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter navn (2)
        if (vaneda.hentNavn() == "Vanedannende"){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter pris (3)
        if (vaneda.hentPris() == 30){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter virkestoff (5)
        if (vaneda.hentVirkestoff() == 990){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter virkestoff (5)
        if (vaneda.hentVanedannendeStyrke() == 3){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        System.out.println(vaneda.toString());


        System.out.println();


        VanligLegemiddel vanlig = new VanligLegemiddel("Vanlig Legemiddel", 10, 350);
        System.out.println("---------------");
        System.out.println();
        System.out.println("Objekt 3");
        System.out.println(vanlig instanceof VanligLegemiddel); //true
        System.out.println();

        // Henter ID (1)
        if (vanlig.hentID() == 3){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter navn (2)
        if (vanlig.hentNavn() == "Vanlig Legemiddel"){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter pris (3)
        if (vanlig.hentPris() == 10){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter virkestoff (5)
        if (vanlig.hentVirkestoff() ==350){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        System.out.println(vanlig.toString());



    }
}
