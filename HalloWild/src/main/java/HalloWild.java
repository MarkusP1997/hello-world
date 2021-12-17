public class HalloWild {
    public static void main (String[] args) {
        System.out.println("Hallo Wild");
        Wild w = new Wild();
        w.wild();
        Wald forest = Wald.A;
        if (forest == Wald.A) {
            System.out.println("Hallo Wald A");
        }
    }
}
