package src;
public class RectangleBis extends FigureBis {
    protected double largeur;
    protected double longueur;

    public RectangleBis(double x, double y, double largeur, double longueur) {
        super(x, y);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double surface() {
        return longueur * largeur;
    }

    @Override
    public void affiche() {
        System.out.println(
            "-------- Rectangle --------" + 
            "\n    C'est un rectangle avec une largeur de " + largeur + " et une longueur de " + longueur);
    }
}
