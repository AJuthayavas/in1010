class Hovedprogram {

  public static void main(String[] args){
    //eksekverOppgaveDelD();
    executeFiler("dataklynge.txt"); // Filer oppgitt i oppgaven
    executeFiler("dataklynge2.txt"); // -- || --
    executeFiler("dataklynge3.txt"); // -- || --
    executeFiler("dataklynge4.txt"); // -- || --
  }

  /*
  // Metode for å teste uten lesing av data fra fil
  private static void eksekverOppgaveDelD(){
    Dataklynge test = new Dataklynge();

    for (int i = 0; i < 450; i++){
      Node nyttNodeObjekt = new Node(512, 4); // 1024GB minne, 2 prosessorer
      test.settInnNode(nyttNodeObjekt);
    }

    for (int i = 0; i < 16; i++){
      Node nyttNodeObjekt = new Node(1024, 8); // 64GB minne, 1 prosessor
      test.settInnNode(nyttNodeObjekt); // noden settes inn i dataklynge abel
    }

    printInfoOmDataklynge(test, "Testing");
  }
  */


  // Hjelpemetode for å skrive ut informasjon
  private static void printInfoOmDataklynge(Dataklynge x, String y){
    System.out.println("\n");
    System.out.println("Dataklynge: " + y);
    System.out.println("Noder med minst 128GB: " + x.noderMedNokMinne(128));
    System.out.println("Noder med minst 512GB: " + x.noderMedNokMinne(512));
    System.out.println("Noder med minst 1024GB: " + x.noderMedNokMinne(1024));
    System.out.println("Antall prosessorer: " + x.antProsessorer());
    System.out.println("Antall rack: " + x.visAntallRacks());
  }

  private static void executeFiler(String filnavn){
    Dataklynge saga = new Dataklynge(filnavn);
    printInfoOmDataklynge(saga, filnavn);
  }
}
