public class Article {
    private int reference;
    private String designation;
    private double prixUnitaire;
    private int quantiteStock;

    /* -------- Constructeur ----------- */
    public Article(int reference, String designation, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    /* -------- Constructeur copie ----------- */
    public Article(Article a) {
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantiteStock = a.quantiteStock;
    }

    /* --------Setter -- Getter----------- */
    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    /* -------- Méthode d'affichage ----------- */
    public void affiche() {
        System.out.println("(Ref : " + reference + ") " + designation +" - Prix : " + prixUnitaire + " euros - "+ quantiteStock + " en stock");
    }
}
