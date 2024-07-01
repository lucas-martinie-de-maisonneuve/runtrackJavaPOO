import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somme = 0;
        System.out.print("Veuillez entrer un nombre : ");
        int nb = input.nextInt();
        input.close();

        for (int i = 1; i <= nb; i++) {
            somme += i * i * i;
        }

        System.out.println("La somme des cubes jusqu'à " + nb + " est : " + somme);
    }
}
