package polymorphicMethods;

public class PolymorphismDemo {
	public static void main(String[] args) {
        // TODO: Uncomment each snippet to check your predictions.

        // a)
//		A x = new D();
//        x.print();

        // b)
//        D x2 = (D)x;
//        x2.print();

        // c)
//        x2.printC();

        // d)
//        B x3 = (B)x;
//        x3.print();

        // e)
//        x3.printC();

        // f)
//        C x4 = new C();
//        x4.printC();

        // g)
//        D x5 = (D)x4;
//        x5.print();
	}
}

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}

class C extends B {
    public void print() {
        System.out.println("C");
    }
    public void printC() {
        print();
    }
}

class D extends C {
    public void print() {
        System.out.println("D");
    }
}