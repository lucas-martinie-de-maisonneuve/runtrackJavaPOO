package src;

public class FigureBis {
    public double x;
    public double y;

    public FigureBis(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println(
            "-------- Figure --------"+
            "\n    Le centre de la figure est en position (" + x + ", " + y + ")");
    }

}
