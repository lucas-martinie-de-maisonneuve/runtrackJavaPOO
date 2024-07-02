package src;

public class FiguresGeometriquesBis {
    public static void main(String[] args) {

        // *** Création de Rectangle
        RectangleBis rectangle = new RectangleBis(5, 4, 5.0, 3.0);
        rectangle.affiche();

        // *** Création de Cercle
        CercleBis cercle = new CercleBis(5.0, 3.0, 10.0);
        cercle.affiche();

        // *** Creation du rectangle coloré
        RectangleColoreBis rectColore = new RectangleColoreBis(5, 4, 3.0, 6.0, 25525598);
        rectColore.affiche();
        // *** Figure
        FigureBis figure = new FigureBis(25.0, 12.0);
        figure.affiche();
    }
}