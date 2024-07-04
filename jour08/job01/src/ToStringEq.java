class ToStringEq {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(12.5, 4.0);
        affiche(1, rect);
        
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        affiche(2, rect1);
        
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, "rouge");
        affiche(3, rect2);

        System.out.println(rect1.equals(rect2)); // 1.
        System.out.println(rect2.equals(rect1)); // 2.
        System.out.println(rect1.equals(null)); // 3.
        System.out.println(rect.equals(rect1)); // 4.
        System.out.println(rect1.equals(rect)); // 5    .
    }

    public static void affiche(int test, Rectangle rectangle){
        System.out.println("\nTest " + test + " :\nLargeur = " + rectangle.largeur + "\nHauteur = " + rectangle.longueur);

        if (rectangle instanceof RectangleColore) {
            System.out.println("couleur = " + ((RectangleColore) rectangle).couleur + "\n");
        }
    }
}