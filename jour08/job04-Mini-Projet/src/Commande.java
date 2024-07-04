import java.time.LocalDate;

public class Commande {
    private int numCommande;
    private LocalDate dateCommande;
    private Client client;

    public Commande(int numCommande, LocalDate dateCommande, Client client) {
        this.numCommande = numCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    /* -------- Méthode d'affichage ----------- */
    protected void affiche() {
        System.out.println("--- Commande ---");
        System.out.println(" > Numéro de commande : " + numCommande);
        System.out.println(" > Date de commande : " + dateCommande);
        System.out.println(" > Client : " + client.nomSocial);
    }

}
