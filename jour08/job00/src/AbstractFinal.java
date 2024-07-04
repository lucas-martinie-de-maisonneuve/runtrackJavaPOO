public class AbstractFinal {
    public static void main(String[] args) {

        // A a = new A(); --> A est une classe abstraite et ne peut pas être instancié
        B b = new B();
        // C c = new C(); --> C est une classe abstraite et ne peut pas être instancié
        D d = new D();
        d.m2();
    }
}

abstract class A {
    abstract void m1();

    final void m2() {
        System.out.println("m2 in A");
    }
}

class B extends A {
    void m1() {
        System.out.println("m1 in B");
    }
}

abstract class C extends B {
    abstract void m3();
}

final class D extends C {
    void m1() {
        System.out.println("m1 in D");
    }

    void m3() {
        System.out.println("m3 in D");
    }
}
