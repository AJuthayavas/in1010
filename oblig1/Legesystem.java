import java.util.*;
import java.io.*;

public class Legesystem {

     private IndeksertListe<Pasient> listeAvPasienter;
     private IndeksertListe<Legemiddel> listeAvLegemidler;
     private IndeksertListe<Lege> listeAvLeger;

     public Legesystem(){
          listeAvPasienter = new IndeksertListe<Pasient>();
          listeAvLegemidler = new IndeksertListe<Legemiddel>();
          listeAvLeger = new IndeksertListe<Lege>();
     }

     public lesFraFil(String filnavn){
          try{
               File fil = new File(filnavn);
               Scanner sc = new Scanner(fil);
               String objekt = "";
               while (sc.hasNextLine()){
                    String data = sc.nextLine();
                    if (data.contains("#")){
                         String[] biter = data.split(" ");
                         // grunnen til at det er biter[1] er fordi vi ikke skal ha linje 1 fra avsnittet, men linje 2 hvor den faktiske dataen befinner seg.
                         objekt = biter[1];
                    } else {
                         String[] biter1 = data.split(",");

                         // PASIENT
                         if (objekt.equals("Pasienter")){
                              Pasient ny = new Pasient(biter1[0], biter1[1]);
                              listeAvPasienter.leggTil(ny);
                         }
                         // LEGEMIDDEL
                         if (objekt.equals("Legemidler")){
                              if (biter1[1].equals("narkotisk")){
                                   Narkotisk ny = new Narkotisk(biter1[0], Integer.parseInt(biter1[2]), Double.parseDouble(biter1[3]), Integer.parseInt(biter1[4]));
                                   listeAvLegemidler.leggTil(ny);
                              }
                              if (biter1[1].equals("vanedannende")){
                                   Vanedannende ny = new Vanedannende(biter1[0], Integer.parseInt(biter1[2]), Double.parseDouble(biter1[3]), Integer.parseInt(biter1[4]));
                                   listeAvLegemidler.leggTil(ny);
                              }
                              if (biter1[1].equals("vanlig")){
                                   VanligLegemiddel ny = new VanligLegemiddel(biter1[0], Integer.parseInt(biter1[2]), Double.parseDouble(biter1[3]));
                                   listeAvLegemidler.leggTil(ny);
                              }
                         }
                         // LEGE
                         if (objekt.equals("Leger")){
                              if (biter1[1].equals("0")){
                                   Lege ny = new Lege(biter1[0]);
                                   listeAvLeger.leggTil(ny);
                              } else if (biter1[1].equals("1")){
                                   Spesialist ny = new Spesialist(biter1[0], biter1[1]);
                                   listeAvLeger.leggTil(ny);
                              } else {
                                   return;
                              }
                         }
                         if (objekt.equals("Resepter")){
                              String legemiddelNummer = biter1[0];
                              String legensNavn = biter1[1];
                              String pasientID = biter1[2];
                              String type = biter1[3];
                              String reit = biter1[4];

                              for (Lege l : listeAvLeger){
                                   if (l.equals(legensNavn)){
                                        if (type.equals("hvit")){
                                             legensNavn.skrivHvitResept();
                                        }
                                        if (type.equals("militaer")){
                                             legensNavn.skrivMilResept();
                                        }
                                        if (type.equals("p")){
                                             legensNavn.skrivpResept();
                                        }
                                        if (type.equals("blaa")){
                                             legensNavn.skrivBlaaResept();
                                        }
                                   }
                              }
                         }

                    }
               }
          }

     }
     
}