class Rack {

  private Node[] listeMedNoder = new Node[12];

  // konstruktør for klasse Rack
  public Rack(){
  }

  // Metode 1: Setter inn noder i arraylista
  public boolean settInn(Node node){
    for (int i = 0; i < listeMedNoder.length; i++){
      if (listeMedNoder[i] == null){
        listeMedNoder[i] = node;
        return true;
      }
    }
    return false;
  }
   
  // Metode 3: Returnerer antall prosessorer i et rack
  public int antProsessorer(){
    int antallProsessorer = 0;
    
    for (Node node : listeMedNoder) {
      if(node == null) {
        return antallProsessorer;
      }
      antallProsessorer += node.antProsessorer();  
    }
    return antallProsessorer;
  }

  // Metode 4: Sjekker om noden har nok påkrevd minne som metoden spør etter. Returnerer antall til slutt.
  public int noderMedNokMinne(int paakrevdMinne){
    int noderSomHarNokMinne = 0;

    for (Node node : listeMedNoder) {
      if(node == null){
        return noderSomHarNokMinne;
      }
      if (node.nokMinne(paakrevdMinne)){
        noderSomHarNokMinne += 1;
      }   
    }
    return noderSomHarNokMinne;
  }

}
