public class Test {
     public static void main(String[] args) {
          String fil = "labyrinter/1.in";
          //String fil = "labyrinter/custom.in";

          Labyrint l = new Labyrint(fil);
          //l.skrivUtKordinater();
          System.out.println(l);
          System.out.println(l.getClass());

          //l.tegnOppLabyrinten();
          //System.out.println(l.toString());
     }
     
}