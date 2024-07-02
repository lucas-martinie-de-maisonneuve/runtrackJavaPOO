class Rectangle {
    private Double largeur;
    private Double longueur;

    public Rectangle(Double largeur, Double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongeur(Double longueur) {
        this.longueur = longueur;
    }

    public Double surface() {
        return longueur * largeur;
    }

}

