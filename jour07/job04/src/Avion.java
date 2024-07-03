public class Avion extends Vehicules {
    public String moteur;
    public int nombreHeures;

    public Avion(String marque, Integer dateAchat, int prixAchat, String moteur, int nombreHeures) {
        super(marque, dateAchat, prixAchat);
        this.moteur = moteur;
        this.nombreHeures = nombreHeures;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Cet avion a un moteur " + moteur + " et " + nombreHeures + " heures de vol.");
    }

    public void calculePrix() {
        prixCourant = prixAchat;

        // En fonction du moteur
        if (moteur.equals("hélice")) {
            int tranchesHeures = nombreHeures / 100;
            for (int i = 0; i < tranchesHeures; i++) {
                prixCourant -= prixAchat * 0.10;
            }
        } else {
            int tranchesHeures = nombreHeures / 1000;
            for (int i = 0; i < tranchesHeures; i++) {
                prixCourant -= prixAchat * 0.10;
            }
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

}