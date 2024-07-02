class Toto {
    int toto = 0;

    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        // System.out.println("Toto t1: " + toto);
    }
}

/*
 * toto n'est pas lié à son instance (t1 ou t2)
 * Il aurait fallu corriger de la sorte : 
 * System.out.println("Toto t1: " + t1.toto);
 */