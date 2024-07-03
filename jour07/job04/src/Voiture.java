public class Voiture extends Vehicules {
    public int cylindree;
    public int nombrePortes;
    public int puissance;
    public int kilometrage;
    public double pourcentage;

    public Voiture(String marque, Integer dateAchat, Integer prixAchat, int cylindree, int nombrePortes, int puissance,
            int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nombrePortes = nombrePortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Cette voiture a " + cylindree + " cylindrées, " + nombrePortes + " portes, " + puissance
                + " chevaux et " + kilometrage + " kilomètres au compteur.");
    }

    public void calculePrix() {
        int age = 2024 - dateAchat;
        prixCourant = prixAchat;

        // En fonction de l'âge
        for (int i = 0; i < age; i++) {
            prixCourant -= prixAchat * 0.02;
        }

        // En fonction du kilométrage
        int tranchesKilometrage = (int) Math.round((double) kilometrage / 10000);
        prixCourant -= prixAchat * 0.05 * tranchesKilometrage;

        // En fonction de la marque
        if (marque.equals("Renault") || marque.equals("Fiat")) {
            prixCourant -= prixAchat * 0.10;
        } else if (marque.equals("Ferrari") || marque.equals("Porsche")) {
            prixCourant += prixAchat * 0.20;
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

}
