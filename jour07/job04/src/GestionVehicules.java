class Vehicules {
    public String marque;
    public int dateAchat;
    public double prixAchat;
    public double prixCourant;

    public Vehicules(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat;
    }

    public void affiche() {
        System.out.println(
                "\nLa marque du véhicule est " + marque + " , acheté en " + dateAchat + " au prix de " + prixAchat
                        + " euros. Son prix est désormais " + prixCourant + " euros.");
    }

    public void calculePrix() {
        int age = 2024 - dateAchat;
        prixCourant = prixAchat;
        for (int i = 0; i < age; i++) {
            prixCourant -= prixCourant * 0.01;
        }
        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }
}