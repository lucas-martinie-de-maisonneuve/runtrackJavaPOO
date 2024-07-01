import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Veuillez entrer un nombre inférieur ou égal à 9 : ");
            n = input.nextInt();
        } while (n > 9 || n < 0);
        input.close();

        System.out.println("La table de multiplication de " + n + " est : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
