package src;

class RectangleColoreBis extends RectangleBis {
    protected int couleur;

    public RectangleColoreBis(double x, double y, double largeur, double longueur, int couleur) {
        super(x, y, largeur, longueur);
        this.couleur = couleur;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        System.out.println("-------- Rect Colore --------" +
            "\n    La surface du rectangle coloré est : " + surface() + 
            "\n    Sa couleur est " + couleur);
    }
}