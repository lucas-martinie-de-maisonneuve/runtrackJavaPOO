import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        int factorielle = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("veuillez entrer le nombre pour la factorielle : ");
        int n = input.nextInt();
        input.close();

        for (int i = n; i > 0; i--) {
            factorielle *= i;
        }
        System.out.println("factorielle de " + n + " = " + factorielle);
    }
}
