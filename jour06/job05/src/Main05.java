import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quel chiffre à mettre au carré ?");
        int nombre = input.nextInt();
        input.close();
        System.out.println("Le carré de " + nombre +" est : " + nombre * nombre);
    }
}
