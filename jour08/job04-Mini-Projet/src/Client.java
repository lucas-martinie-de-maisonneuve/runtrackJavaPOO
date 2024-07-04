public class Client extends Personne {
    private double chiffreAffaire;

    /* -------- Constructeur ----------- */
    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

        /* --------Setter -- Getter----------- */
    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    /*
     * -------- Méthode d'affichage -----------
     * - Affiche les infos de la classe Personne
     * - Affiche le chiffre d'affaire
     */
    public void affiche() {
        super.affiche();
        System.out.println("(ChiffreAffaire : " + chiffreAffaire +" euros)" );
    }
}
