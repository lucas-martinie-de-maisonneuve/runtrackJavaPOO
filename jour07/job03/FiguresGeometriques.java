public class FiguresGeometriques {
    public static void main(String[] args) {

        // *** Creation du Rectangle 
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Longueur du rectangle : " + rectangle.getLongueur());
        System.out.println("Largeur du rectangle : " + rectangle.surface() + "\n");

        // *** Creation du cercle
        Cercle cercle = new Cercle(5.0, 3.0, 10.0);
        cercle.affiche();
        double point1 = 6.0, point2 = 12.0;
        if (cercle.estInterieur(point1, point2)) {
            System.out.println("Le point (" + point1 + " , " + point2 + ") est à l'intérieur\n");
        } else {
            System.out.println("Le point est à l'éxterieur\n");
        }

        // *** Creation du rectangle coloré
        RectangleColore rectColore = new RectangleColore(3.0, 6.0, 25525598);
        System.out.println("La surface du rectangle coloré est : " + rectColore.surface() + "\nSa couleur est " + rectColore.getCouleur());
    }
}