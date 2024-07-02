public class Main31 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Longueur du rectangle : " + rectangle.getLongueur());
        System.out.println("Largeur du rectangle : " + rectangle.surface());

        Cercle cercle = new Cercle(5.0, 3.0, 10.0);
        cercle.affiche();

        double point1 = 6.0, point2 = 12.0;
        if (cercle.estInterieur(point1, point2)) {
            System.out.println("Le point (" + point1 + " , " + point2 + ") est à l'intérieur");
        } else {
            System.out.println("Le point est à l'éxterieur");
        }
    }
}