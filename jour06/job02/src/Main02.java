import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quel est ton prénom ?");
        String prenom = input.nextLine();
        input.close();
        System.out.println("Bonjour " + prenom);
    }
}
