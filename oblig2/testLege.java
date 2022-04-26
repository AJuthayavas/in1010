public class testLege {
    public static void main(String[] args) {
        Lege l1 = new Lege("Ole");
        Lege l2 = new Lege("Dole");
        Spesialist s1 = new Spesialist("Doffen", "X");

        System.out.println(l1.toString());
        System.out.println();
        System.out.println(l2.toString());
        System.out.println();
        System.out.println(s1.toString());
    }
    
}
