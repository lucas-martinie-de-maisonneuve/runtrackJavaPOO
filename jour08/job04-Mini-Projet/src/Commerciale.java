import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;

public class Commerciale {
    private Vector<Article> articles;
    private Vector<Client> clients;
    private Vector<Commande> commandes;
    private Vector<Ligne> lignes;

    private static int choix;
    private static String inputString;

    public Commerciale() {
        this.articles = new Vector<>();
        this.clients = new Vector<>();
        this.commandes = new Vector<>();
        this.lignes = new Vector<>();
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public void ajouterArticle(Article a) {
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public static void main(String[] args) {

        afficherMenu();
        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi d'ajouter un article.");
                ajouterArticle();
                break;
            case 2:
                System.out.println("Vous avez choisi de supprimer un article.");
                break;
            case 3:
                test();
            case 0:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix non encore implémenté.");
                break;
        }
    };

    public static void test() {

        Client c1 = new Client(25121993, "Vanlu Lamartinie de Orte", "41 rue roussel Doria", 100000);

        Article a1 = new Article(124002, "Banane", 1.80, 200);
        Article a2 = new Article(a1);
        a2.setDesignation("Pomme");

        Commande com1 = new Commande(1800, LocalDate.of(2024, 7, 2), c1);

        Ligne ligne = new Ligne(com1, a1, 12);
        ligne.affiche();
    }

    private static void afficherMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n" +
                "       ╔════════════════ Gestion Commerciale ═════════════════╗\n" +
                "       ║                                                      ║\n" +
                "       ║ [1] Ajouter un article   ║  [2] Supprimer un article ║\n" +
                "       ║ [2] Ajouter un client    ║  [3] Supprimer un client  ║\n" +
                "       ║ [4] Passer une commande  ║  [5] Annuler une commande ║\n" +
                "       ║                                                      ║\n" +
                "       ║                                                      ║\n" +
                "       ║ [0]  Quitter                                         ║\n" +
                "       ╚══════════════════════════════════════════════════════╝\n");
        do {
            System.out.print("Veuillez entrer votre choix : ");
            inputString = input.next();
            if (inputString.matches("[0-6]")) {
                choix = Integer.parseInt(inputString);
            } else {
                choix = -1;
                System.out.print("Veuillez entrer un chiffre entre 0 et 6 \n");
            }

        } while (choix < 0 || choix > 6);
        input.close();

    }

    private static void ajouterArticle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez l'ID de l'article : ");
        int id = input.nextInt();
        input.nextLine(); // Consume newline left-over
        System.out.print("Entrez la désignation de l'article : ");
        String designation = input.nextLine();
        System.out.print("Entrez le prix unitaire de l'article : ");
        double prixUnitaire = input.nextDouble();
        System.out.print("Entrez la quantité en stock de l'article : ");
        int quantiteStock = input.nextInt();

        Article nouvelArticle = new Article(id, designation, prixUnitaire, quantiteStock);
        // ajouterArticle(nouvelArticle);
        System.out.println("Article ajouté avec succès !");
    }
}
