
public class A {

	private String name;
	private B b;
	
	public A(String name) {
		this.b  = new B();
		this.name = name;
	}
	
	public void setBValue(int value) {
		this.b.setValue(value);
	}

	
}
