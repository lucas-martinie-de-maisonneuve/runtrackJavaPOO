import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(25121993, "Vanlu Lamartinie de Orte", "41 rue roussel Doria", 10000000);
        c1.affiche();

        Article a1 = new Article(124002, "Banane", 1.80, 200);
        Article a2 = new Article(a1);
        a2.setDesignation("Pomme");
        a1.affiche();
        a2.affiche();

        Commande com1 = new Commande(1800, LocalDate.of(2024, 7, 2), c1);
        com1.affiche();
    };
}
