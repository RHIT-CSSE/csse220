package paper;

import java.util.ArrayList;


public class UMLCodeCompare {

}


class A extends B {
	private ArrayList<C> foo;
	private String name;
}

class B {
	private double val;
	
	public double getVal() {
		return this.val;
	}
}

interface C {
	public double calculate();
}

class D implements C{
	private A bar;
	public double calculate( B b){
		return b.getVal()*10;
	}
	
	public double calculate(){
		return 100;
	}
}


