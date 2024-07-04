abstract class Personne {
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    /* -------- Constructeur ----------- */
    protected Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    /* --------Setter -- Getter----------- */
    protected void setIdentite(int identite) {
        this.identite = identite;
    }

    protected int getIdentite() {
        return identite;
    }

    protected void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    protected String getNomSocial() {
        return nomSocial;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    protected String getAdresse() {
        return adresse;
    }

    /* -------- Méthode d'affichage ----------- */
    protected void affiche() {
        System.out.println("--- PERSONNE ---");
        System.out.println(" > Identité : " + identite);
        System.out.println(" > Nom : " + nomSocial);
        System.out.println(" > Adresse : " + adresse);
    }

}