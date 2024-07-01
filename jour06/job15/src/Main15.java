import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, inverse = 0;

        System.out.print("Veuillez entrer un nombre : ");
        n = input.nextInt();
        input.close();

        while (n > 0) {
            int reste = n % 10;
            inverse = inverse * 10 + reste;
            n = n / 10;
        }
        System.out.print("Nombre inversé : " + inverse);

    }
}
