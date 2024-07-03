public class Main04 {
    public static void main(String[] args) {

        Voiture v1 = new Voiture("BMW", 2003, 9800, 4, 5, 200, 80000);
        v1.calculePrix();
        v1.affiche();

        Avion a1 = new Avion("Boeing", 2010, 250000, "hélice", 200);
        a1.calculePrix();
        a1.affiche();

    }
}
