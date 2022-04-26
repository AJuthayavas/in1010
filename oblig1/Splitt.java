import java.util.*;
import java.io.*;

public class Splitt {

     public Splitt(String filnavn){
          lesFraFil(filnavn);
     }

     public void lesFraFil(String filnavn){
          Scanner fil = null;

          try{
               fil = new Scanner(new File(filnavn));
               while (fil.hasNextLine()){
                    String linje = fil.nextLine();

                    if (fil.nextLine() == "#"){

                    }



               }  
          }


     }
     
}
