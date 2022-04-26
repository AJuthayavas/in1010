class Node {
  
  private int onsketMinne;
  private int prosessorAntall;
  
  // konstruktør for klasse Node
  public Node(int onsketMinne, int prosessorAntall){
    this.onsketMinne = onsketMinne;
    this.prosessorAntall = prosessorAntall;
  }

  // Metode 1: Returnerer antall prosessorer fra en spesfikk node
  public int antProsessorer(){
    return prosessorAntall;
  }

  // Utfører en sjekk på om det er tilstrekkelig minne for en node
  public boolean nokMinne(int paakrevdMinne){ 
    return (paakrevdMinne <= onsketMinne);
  }
}
  