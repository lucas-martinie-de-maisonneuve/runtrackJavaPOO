public class Main {
    public static void main(String[] args) {
        char v1 = 'A';
        String v2 = "Bonjour";
        int v3 = 10;
        long v4 = 100000;
        float v5 = 10.5f;
        boolean v6 = true;

        System.out.println("char : " + v1);
        System.out.println("String : " + v2);
        System.out.println("Int : " + v3);
        System.out.println("Long : " + v4);
        System.out.println("Float : " + v5);
        System.out.println("Boolean : " + v6);

        int TOTO = (int) 3.817;
        System.out.println("TOTO : " + TOTO);
            // On remarque que 3.817 en int est arrondi à 3
    }
}
