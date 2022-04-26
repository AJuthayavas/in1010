import java.util.*;
import java.io.*;

class Dataklynge {
    
    // Arraylisten skal holde styr på antall Rack-objekter
    private ArrayList<Rack> listeMedRacks= new ArrayList<Rack>();
  
    /*
    //Brukes til deloppgave D.
    // Konstruktør for klasse Dataklynge
    public Dataklynge(){
    }
    */
    

    // Konstruktør for klasse Dataklynge
    // Fjernes hvis oppgave D skal testes.
    public Dataklynge(String filnavn){
        lesFraFil(filnavn);
    }
    
    // Metode 1: Leser inn informasjon fra fil.
    public void lesFraFil(String filnavn){
        Scanner fil = null;
        
        try{
            fil = new Scanner(new File(filnavn));
            while (fil.hasNextLine()){
                String linje = fil.nextLine();
                
                //Splitter hver linje i 3, for hver linje.
                String[] delt = linje.split(" ");

                // Første tallet på linja
                int node = Integer.parseInt(delt[0]);
                // Andre tallet på linja
                int prosessor = Integer.parseInt(delt[1]);
                // Tredje tallet på linja
                int minne = Integer.parseInt(delt[2]);

                // Oppgaven sier max 16 prosessorer && 4096GB minne per node er lovlig!
                if (prosessor > 16 || minne > 4096) {
                    throw new Exception("Filen " + filnavn + " har feil i data.");
                }
                // Metode 2: En hjelpemetode for å opprette Racks med dataen fra txt-filer.
                settInnInfo(node, prosessor, minne);
            }
        } catch (Exception e){
            System.out.println();
            System.out.println(e.getMessage());
            System.exit(1);
        }
        fil.close();
    }

    // Metode 2: Bruker dataen som ble lest til å opprette objekter (Node, Rack).
    public void settInnInfo(int antall, int prosessor, int minne){
        int teller = 0;     

        // Så lenge programmet klarer å lese inn en node fra filen, opprett ny node og sett den inn i et rack.
        while (teller < antall){
            Node n = new Node(minne, prosessor);
            settInnNode(n);
            teller++;
        }
    }

    // Metode 3: Putter en node i et rack om det er plass, er det ingen rack til å begynne med opprettes det et nytt rack.  
    public void settInnNode(Node node){
        int index = listeMedRacks.size();

        if (index == 0){
            opprettNyRackSettInnNode(node);
            return;
        }   

        Rack siste = listeMedRacks.get(index-1);

        boolean sucess = siste.settInn(node);

        if (!sucess) {
            opprettNyRackSettInnNode(node);
            return;
        }         
    }

    // Metode 4: Oppretter et nytt rack og setter deretter noden inn i dette racket som ble laget.
    private void opprettNyRackSettInnNode(Node node){
        Rack ny = new Rack();
        ny.settInn(node);
        listeMedRacks.add(ny);
    }

    // Metode 5: Returnerer antall prosessorer fra hele dataklyngen
    public int antProsessorer(){
        int antallProsessorer = 0;
        for (Rack rack : listeMedRacks){            
            antallProsessorer += rack.antProsessorer();
        }
        return antallProsessorer;
    }

    // Metode 6: Returnerer antall noder som har paakrevd minne, som metoden bestemmer
    public int noderMedNokMinne(int paakrevdMinne){
        int antallNoderSomHarNokMinne = 0;

        for (Rack x : listeMedRacks){
            antallNoderSomHarNokMinne += x.noderMedNokMinne(paakrevdMinne);
        }
        return antallNoderSomHarNokMinne;
    }

    // Metode 7: Returnerer antall racks i dataklyngen
    public int visAntallRacks(){
        return listeMedRacks.size();
    }
}
