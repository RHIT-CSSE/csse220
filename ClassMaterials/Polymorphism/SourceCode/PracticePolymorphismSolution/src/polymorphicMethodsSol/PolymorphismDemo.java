package polymorphicMethodsSol;

public class PolymorphismDemo {

	public static void main(String[] args) {
		A x = new D();
        x.print();

        D x2 = (D)x;
        x2.print();
        x2.printC();

        B x3 = (B)x;
        x3.print();
        //x3.printC();  //compile error because B does not have a printC method!

        C x4 = new C();
        x4.printC();

        D x5 = (D)x4; //runtime error, can't cast since x4 is not actually a D!
        x5.print();
	}
	
	
}

class A {
	public void print() {
		System.out.println("A");
	}
}

class B extends A{
	public void print() {
		System.out.println("B");
	}
}

class C extends B{
	public void print() {
		System.out.println("C");
	}
	public void printC() {
		print();
	}
}

class D extends C{
	//try removing this or renaming it to printD so students see that print() goes up the parent to find it
	public void print() {
		System.out.println("D");
	}
}