package simpleClassDemo;

public class PolymorphismDemo {
	public static void main(String[] args) {
		Object x = new D();
	}
}
class A {
	public void foo() {
		System.out.println("A");
	}
}
class B extends A {
	public void foo() {
		System.out.println("B");
	}
}
class C extends B {
	public void foo() {
		System.out.println("C");
	}
}
class D extends C {
	public void foo() {   
		System.out.println("D");  
	}
}