package src;

public class CercleBis extends FigureBis {
    protected double rayon;

    public CercleBis(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void affiche() {
        System.out.println(
            "-------- Cercle --------" + 
            "\n    Le cercle est en position (" + x + ", " + y + ")" + 
            "\n    Son rayon est de " + rayon);

        double point1 = 6.0, point2 = 12.0;
        if (estInterieur(point1, point2)) {
            System.out.println("    Le point (" + point1 + ", " + point2 + ") est à l'intérieur du cercle");
        } else {
            System.out.println("    Le point (" + point1 + ", " + point2 + ") est à l'extérieur du cercle");
        }
    }

    public boolean estInterieur(double a, double b) {
        double distance = Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
        return distance <= rayon;
    }
}
