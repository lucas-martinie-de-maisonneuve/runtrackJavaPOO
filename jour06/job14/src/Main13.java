import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre : ");
        int n = input.nextInt();
        input.close();

        System.out.println("Les nombres pairs inférieur à " + n + " sont : ");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " | ");
            }
        }
    }
}
