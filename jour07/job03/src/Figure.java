public class Figure {
    public double x;
    public double y;

    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("Le x est : " + x + "\nLe y est : " + y);
    }
}    
