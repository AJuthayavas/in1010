import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrint {

     int antallRader; // y akse ( | )
     int antallKolonner; // x akse ( <--> )
     // RUTE = (y, x)
     Rute[][] maze;// = new Rute[antallRader][antallKolonner];
     //char[][] labyrint;// = new Rute[antallRader][antallKolonner];
     Labyrint lab;
     static ArrayList<String> listeOverHverEnesteLinjeIfilen = new ArrayList<>();

     public Labyrint (String filnavn){
          try {

          File f = new File(filnavn);
          Scanner sc = new Scanner(f);
          Scanner sc2 = new Scanner(f); // for print loop

          String[] str = sc.nextLine().split(" ");
          String[] str2 = sc2.nextLine().split(" "); // for print loop
          int antall_rader = Integer.parseInt(str[0]);
          int antall_kolonner = Integer.parseInt(str[1]);
          maze = new Rute[antall_rader][antall_kolonner];
          Rute r = null;



          // √ fungerer
          // dette er print loopen
          // midlertidig test, for å sjekke om ting oppfører seg som det skal
          // UPDATE! se metode tegnOppabyrint() --> den gjør akkurat det denne loopen gjør
          // UPDATE 2! for at metoden skal funke må loopen være aktiv, men printinga (linje 42) kan kommenteres vekk
          while (sc2.hasNextLine()){
               String l = sc2.nextLine();
               listeOverHverEnesteLinjeIfilen.add(l);
          } // print loop ferdig
          for (int x = 0; x < listeOverHverEnesteLinjeIfilen.size(); x++){
               //System.out.println(x + " " + listeOverHverEnesteLinjeIfilen.get(x));
          }
          


//-----------------------------------denne delen oppretter Rute-objekter-----------------------------------//
          int tmp_linje_locator = 1; // index 0 ----> [8 9]..[x+1, y+1] (øverste linje i hver fil basically)
          int tmp_rad_locator = 0;
          while (sc.hasNextLine()){
               String[] linjer = sc.nextLine().split("");

               for (int tmp_kol_looper = 0; tmp_kol_looper < linjer.length; tmp_kol_looper++){
                    //System.out.println(linjer[i]);

//------------------------------denne delen finner Aapninger på første og siste linja i labyrinten------------------------------//
                    // hvis det finnes åpning(".") på første linje eller siste linje:
                    if (linjer[tmp_kol_looper].contains(".") && (tmp_linje_locator == 1 || tmp_linje_locator == antall_rader)){
                         Aapning aapning = new Aapning(tmp_rad_locator, tmp_kol_looper, lab);
                         opprettAapningRute(aapning);
                         //System.out.println(aapning);

                    // hvis det ikke finnes åpning(".") på første linje eller siste linje:                         
                    } else if (!linjer[tmp_kol_looper].contains(".") && (tmp_linje_locator == 1 || tmp_linje_locator == antall_rader)){
                         SortRute sr = new SortRute(tmp_rad_locator, tmp_kol_looper, lab);
                         opprettSortRute(sr);
                         //opprettNyRute(tmp_rad_locator, tmp_kol_looper, "#");
                         //System.out.println(sr);
                    
//-------denne delen finner Aapninger på starten og slutten(høyre/venstre side) av hver kolonne på hver linje i labyrinten-------//
                    } else {
                         // hvis det finnes åpning(".") på index 0 eller 1 på hver linje utenom første og siste linje:
                         if (linjer[tmp_kol_looper].contains(".") && (tmp_kol_looper == 0 || tmp_kol_looper == linjer.length-1)){
                              Aapning aapning2 = new Aapning(tmp_rad_locator, tmp_kol_looper, lab);
                              opprettAapningRute(aapning2);
                              //System.out.println(aapning2);
                         
                         // dette gjelder linjer ekskludert index 0 og index -1, basically resten
                         } else if (linjer[tmp_kol_looper].contains("#")){
                              SortRute sr2 = new SortRute(tmp_rad_locator, tmp_kol_looper, lab);
                              opprettSortRute(sr2);
                              //opprettNyRute(tmp_rad_locator, tmp_kol_looper, "#");
                              //System.out.println(sr2);
                         } else if (linjer[tmp_kol_looper].contains(".")){
                              HvitRute hr = new HvitRute(tmp_rad_locator, tmp_kol_looper, lab);
                              opprettHvitRute(hr);
                              //opprettNyRute(tmp_rad_locator, tmp_kol_looper, ".");
                              //System.out.println(hr);
                         }
                    }
               }
               tmp_linje_locator++;
               tmp_rad_locator++;
          }
     } catch (FileNotFoundException e){
          System.out.println(e.getMessage());
     }
     } // avslutt konstruktør


     public void finnUtveiFra(int rad, int kol){
          //
     }

     public boolean gyldigRute(char[][] maze, int r, int k){
          if (r >= 0 && r < antallRader && k >= 0 && k < antallKolonner){
               return maze[r][k] == '.';
          } else {
               return false;
          }
     }

     public Rute visDenneRuten(int rad, int kolonne){
          return maze[rad][kolonne];
     }

     public void skrivUtKordinater(){
          for (int i = 0; i < maze.length; i++){
               System.out.println();
               for (int y = 0; y < maze[i].length; y++){
                    System.out.println(i + "," + y);
               }
          }
     }

     // denne metoden kan KUN bli kalt på hvis det finnes et Labyrint(.in-fil) objekt fra før av i main()
     // denne skal bare printe ut hvordan labyrinten ser ut i filen --> #.#...##..
     public void tegnOppLabyrinten(){
          int teller = 0;
          for (String s : listeOverHverEnesteLinjeIfilen){
               System.out.println(teller + " " + s);
               teller++;
          }
     }





     /*
     private class Node{
          Node neste;
          Rute rute;

          private Node(Rute rute){
               this.rute = rute;
          }
     }
     */

     /*
     public void opprettNyRute(int rad, int kol, String symbol){
          if (symbol.equals(".")){
          //if (symbol.contains(".")){
               maze[rad][kol] = new HvitRute(rad, kol, this);
          
          } else if (symbol.equals("#")){
          //else if (symbol.contains("#")){
               maze[rad][kol] = new SortRute(rad, kol, this);
          } else {
               System.out.println("Beklager, det symbolet er ugyldig i dette programmet!");
               System.out.println("Tast inn enten ./#");
          }
     }
     */

     public void opprettHvitRute(HvitRute sr){
          maze[sr.hentRadNummer(sr)][sr.hentKolonneNummer(sr)] = new HvitRute(sr.hentRadNummer(sr), sr.hentKolonneNummer(sr), this);    
     }

     public void opprettSortRute(SortRute sr){
          maze[sr.hentRadNummer(sr)][sr.hentKolonneNummer(sr)] = new SortRute(sr.hentRadNummer(sr), sr.hentKolonneNummer(sr), this);    
     }

     public void opprettAapningRute(Aapning aa){
          maze[aa.hentRadNummer(aa)][aa.hentKolonneNummer(aa)] = new Aapning(aa.hentRadNummer(aa), aa.hentKolonneNummer(aa), this);    
     }

     
     @Override
     public String toString(){
          String mld = "";

          for (int i = 0; i < antallRader; i++){
               for (int e = 0; e < antallKolonner; e++){
                    char output = maze[i][e].symbol();
                    mld += output;
               }
               if (i < antallRader -1){
                    mld += "\n";
               }
          }
          return mld;
     }
     
}