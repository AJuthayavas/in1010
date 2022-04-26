public class testResept {
    public static void main(String[] args) {

        Narkotisk narko = new Narkotisk("Hostesaft", 250, 1250, 7);
        Vanedannende vaneda = new Vanedannende("Paracet", 100, 990, 3);
        VanligLegemiddel vanlig = new VanligLegemiddel("Ibuprofen", 10, 350);

        Lege l1 = new Lege("testLege");
        Lege l2 = new Lege("testLege2");

        HviteResepter hr = new HviteResepter(narko, l1, 44, 6);
        System.out.println("----------Objekt 1----------");
        if (hr instanceof HviteResepter){
            System.out.println("Riktig objekt-print.");
        } else {
            System.out.println("Feil objekt-print.");
        }
        System.out.println();

        // Henter id (1)
        if (hr.hentID() == 1){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter legemiddel (2)
        if (hr.hentLegemiddel() == narko){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter lege (3)
        if (hr.hentLege() == l1){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter pasientID (4)
        if (hr.pasientID == 44){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter reit (5)
        if (hr.hentReit() == 6){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        // Tar i bruk bruk() og tester reit (6)
        if (hr.bruk() && hr.hentReit() == 5){
            System.out.println("Riktig 6");
        } else {
            System.out.println("Feil 6");
        }

        // Henter farge (7)
        if (hr.farge() == "Resepten har hvit farge"){
            System.out.println("Riktig 7");
        } else {
            System.out.println("Feil 7");
        }

        // Henter pris (8)
        if (hr.prisAaBetale() == 250){
            System.out.println("Riktig 8");
        } else {
            System.out.println("Feil 8");
        }



        System.out.println();
        System.out.println();



        MilResept mr = new MilResept(vanlig, l2, 99);
        System.out.println("----------Objekt 2----------");
        if (mr instanceof MilResept){
            System.out.println("Riktig objekt-print.");
        } else {
            System.out.println("Feil objekt-print.");
        }
        System.out.println();

        // Henter id (1)
        if (mr.hentID() == 2){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter legemiddel (2)
        if (mr.hentLegemiddel() == vanlig){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter lege (3)
        if (mr.hentLege() == l2){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter pasientID (4)
        if (mr.pasientID == 99){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter reit (5)
        if (mr.hentReit() == 3){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        // Tar i bruk bruk() og tester reit (6)
        if (mr.bruk() && mr.hentReit() == 2){
            System.out.println("Riktig 6");
        } else {
            System.out.println("Feil 6");
        }

        // Henter farge (7)
        if (mr.farge() == "Resepten har hvit farge"){
            System.out.println("Riktig 7");
        } else {
            System.out.println("Feil 7");
        }

        // Henter reit (8)
        if (mr.prisAaBetale() == 0){
            System.out.println("Riktig 8");
        } else {
            System.out.println("Feil 8");
        }



        System.out.println();
        System.out.println();



        pResept pr = new pResept(narko, l1, 16, 10);
        System.out.println("----------Objekt 3----------");
        if (pr instanceof pResept){
            System.out.println("Riktig objekt-print.");
        } else {
            System.out.println("Feil objekt-print.");
        }
        System.out.println();

        // Henter id (1)
        if (pr.hentID() == 3){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter legemiddel (2)
        if (pr.hentLegemiddel() == narko){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter lege (3)
        if (pr.hentLege() == l1){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter pasientID (4)
        if (pr.pasientID == 16){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter reit (5)
        if (pr.hentReit() == 10){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        // Tar i bruk bruk() og tester reit (6)
        if (pr.bruk() && pr.hentReit() == 9){
            System.out.println("Riktig 6");
        } else {
            System.out.println("Feil 6");
        }

        // Henter farge (7)
        if (pr.farge() == "Resepten har hvit farge"){
            System.out.println("Riktig 7");
        } else {
            System.out.println("Feil 7");
        }

        // Henter pris (8)
        if (pr.prisAaBetale() == narko.hentPris()-108){
            System.out.println("Riktig 8");
        } else {
            System.out.println("Feil 8");
        }



        System.out.println();
        System.out.println();



        BlaaResepter br = new BlaaResepter(vaneda, l2, 117, 11);
        System.out.println("----------Objekt 4----------");
        if (br instanceof BlaaResepter){
            System.out.println("Riktig objekt-print.");
        } else {
            System.out.println("Feil objekt-print.");
        }
        System.out.println();

        // Henter id (1)
        if (br.hentID() == 4){
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        // Henter legemiddel (2)
        if (br.hentLegemiddel() == vaneda){
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        // Henter lege (3)
        if (br.hentLege() == l2){
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        // Henter pasientID (4)
        if (br.pasientID == 117){
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        // Henter reit (5)
        if (br.hentReit() == 11){
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        // Tar i bruk bruk() og tester reit (6)
        if (br.bruk() && br.hentReit() == 10){
            System.out.println("Riktig 6");
        } else {
            System.out.println("Feil 6");
        }

        // Henter farge (7)
        if (br.farge() == "Resepten har blå farge"){
            System.out.println("Riktig 7");
        } else {
            System.out.println("Feil 7");
        }

        // Henter pris (8)
        if (br.prisAaBetale() == 25){
            System.out.println("Riktig 8");
        } else {
            System.out.println("Feil 8");
        }
    }
    
}
