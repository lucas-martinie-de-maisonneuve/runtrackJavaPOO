import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer le premier nombre : ");
        int nombre1 = input.nextInt();
        System.out.print("Entrer le deuxième nombre : ");
        int nombre2 = input.nextInt();
        System.out.print("Entrer le troisième nombre : ");
        int nombre3 = input.nextInt();
        input.close();

        int plusGrandNombre = nombre1;

        if (nombre2 > plusGrandNombre) {
            plusGrandNombre = nombre2;
        }

        if (nombre3 > plusGrandNombre) {
            plusGrandNombre = nombre3;
        }

        System.out.println("Le plus grand nombre entre " + nombre1 +", " + nombre2 + " et " + nombre3 + " est : " + plusGrandNombre);
    }
}
