class Rectangle{
    public Double largeur;
    public Double longueur;

    public Rectangle(Double largeur, Double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    public Double surface() {
        return longueur * largeur;
    }

}