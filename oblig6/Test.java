import java.io.FileNotFoundException;

public class Test {
     public static void main(String[] args) {
          String fil = "labyrinter/1.in";

          try {
               Labyrint l = new Labyrint(fil);
               //l.skrivUtKordinater();
               System.out.println(l);

               l.tegnOppLabyrinten();
               

          } catch (FileNotFoundException e){
               System.out.println(e.getMessage());
          }
     }
     
}