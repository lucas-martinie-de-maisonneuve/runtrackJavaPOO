public class Main11 {
    public static void main(String[] args) {
        int factorielle = 1;
        for (int i = 8; i > 0; i--) {
            factorielle *= i;
        }
        System.out.println("factorielle 8 = " + factorielle);
    }
}
