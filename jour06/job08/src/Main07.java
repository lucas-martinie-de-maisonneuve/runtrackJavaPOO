import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        double moyenne = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Entrez le nombre " + (i+1) + " : ");
            moyenne += input.nextInt();
        }
        input.close();
        moyenne = moyenne / 5;

        System.out.println("La moyenne est : " + moyenne );
    }
}
