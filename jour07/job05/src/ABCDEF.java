class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        /*
         * a = b; --> Vrai
         * b = a; --> Faux
         * a = (A) b; --> Vrai
         * a = null; --> Vrai
         * null = a; --> Faux
         * a = d; --> Vrai
         * b = d; --> Faux
         * a = e; --> Vrai
         * d = e; --> Vrai
         */

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as);
        additionner(as);

    }

    private static void rechercher(A[] as) {
        int count = 0;
        for(A a : as ){
            if (a instanceof B){
                count++;
            }
        }
        System.out.println("Il y à " + count + " instance de B dans le tableau");
    }

    private static void additionner(A[] as) {
        int count = 0;
        for(A a : as ){
            if (a instanceof D){
                count += ((D) a).d;
            }
        }
        System.out.println("La somme des variables d de D est de " + count);
    }

}
