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
    public Scanner input = new Scanner(System.in);

    public Commerciale() {
        articles = new Vector<>();
        clients = new Vector<>();
        commandes = new Vector<>();
        lignes = new Vector<>();

    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();
        commerciale.test();
        do {
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
                inputString = commerciale.input.next();
                if (inputString.matches("[0-6]")) {
                    choix = Integer.parseInt(inputString);
                } else {
                    choix = -1;
                    System.out.print("Veuillez entrer un chiffre entre 0 et 6 \n");
                }

            } while (choix < 0 || choix > 6);

            switch (choix) {
                case 1:
                    commerciale.ajouterArticle();
                    break;
                case 2:
                    commerciale.supprimerArticle();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix non encore implémenté.");
                    break;
            }
        } while (choix != 0);
        commerciale.input.close();

    };

    public void test() {

        Client c1 = new Client(25121993, "Vanlu Lamartinie de Orte", "41 rue roussel Doria", 100000);

        Article a1 = new Article(123, "Banane", 1.80, 200);
        Article a2 = new Article(a1);
        a2.setDesignation("Pomme");
        a2.setReference(8);
        Article a3 = new Article(95, "Cerise", 8.80, 900);
        articles.add(a1);
        articles.add(a2);
        articles.add(a3);

        Commande com1 = new Commande(1800, LocalDate.of(2024, 7, 2), c1);

        Ligne ligne = new Ligne(com1, a1, 12);
        ligne.affiche();
    }

    public void afficheArticle() {
        for (Article article : articles) {
            System.out.print("--> ");
            article.affiche();
        }
    }

    public void ajouterArticle() {
        System.out.print("ID de l'article : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Désignation de l'article : ");
        String designation = input.nextLine();
        System.out.print("Prix unitaire de l'article : ");
        double prixUnitaire = input.nextDouble();
        System.out.print("Quantité en stock de l'article : ");
        int quantiteStock = input.nextInt();

        Article nouvelArticle = new Article(id, designation, prixUnitaire, quantiteStock);

        articles.add(nouvelArticle);
        System.out.println("Article ajouté avec succès !");
    }

    public void supprimerArticle() {
        Article articleToRemove = null;
        System.out.println("\nVous voulez supprimer un article. Voici la liste : \n");
        afficheArticle();

        System.out.print("\nVeuillez entrer la référence de l'article à supprimer : ");
        int ref = input.nextInt();
        for (Article article : articles) {
            if (ref == article.getReference()) {
                articles.remove(article);
                articleToRemove = article;
                break;
            }
        }
        if (articleToRemove != null) {
            System.out.println("\n Article supprimé avec succès ! Voici la liste mis à jour :\n");
            afficheArticle();
        } else {
            System.out.println("\nLa référence n'a pas été trouvé");
        }

    }
}
