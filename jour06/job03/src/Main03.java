public class Main03 {
    public static void main(String[] args) {
        int Tableau[] = new int[10];

        for(int i =0; i <   10; i++){
            Tableau[i] = i;
        }

        System.out.println("Tableau[0] : " + Tableau[0]);
        System.out.println("Tableau[1] : " + Tableau[1]);
        System.out.println("Tableau[5] : " + Tableau[5]);
        System.out.println("Tableau[9] : " + Tableau[9]);

        System.out.println("Tableau[10] n'existe pas car seul 10 entier sont stocké");
    }
}