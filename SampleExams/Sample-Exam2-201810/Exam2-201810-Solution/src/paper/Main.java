package paper;
public class Main {
	public static int fun(int x)  {
	    int result = 10;
	    System.out.println("fun x = " + x);
	    try {
	        result = otherFun(x);
	        result = otherFun(x+10);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Fun caught");
	    	result = 0;
	    }    
	    return result;
	}

	public static int otherFun(int x) throws IllegalArgumentException {
	    if (x < 10) {
	        throw new IllegalArgumentException();
	    }  
	    System.out.println("other returns " + (x * 2));
	    return x*2;
	}

	public static void main(String[] args) {
		try {
	        System.out.println(fun(5) + " is fun(5)");
	        System.out.println();
	        System.out.println(fun(12) + " is fun(12)");
	        System.out.println("done.");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Main caught");
	    }
	}
}
