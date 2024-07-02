class Cercle {
    private double x;
    private double y;
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println(
                "Le cercle est en position (" + getX() + " , " + getY() + ")\n" +
                        "Son rayon est de " + getRayon());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double surface() {
        return rayon * rayon * Math.PI;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public boolean estInterieur(double a, double b) {
        double distance = (a - x) * (a - x) + (b - y) * (b - y);
        return distance <= rayon * rayon;
    }
}
