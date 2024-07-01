import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quel est votre âge ? ");
        int âge = input.nextInt();
        input.close();

        if (âge < 18)
            System.out.println("Vous êtes mineur");
        else
            System.out.println("Vous êtes majeur");
    }
}
