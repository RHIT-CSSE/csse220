package slides;

public class ScopeDemo {
	
	
	String instanceVar = "instance";
	
	public static void main(String[] args) {
		String localVar = "dog";
		//cannot access instance vars or this
		
		//static context
		class InnerClassInsideMethod {
			
			String myInnerVar = localVar;
			//String myInnerVar2 = instanceVar;
			
		}
		
		
	}
	
	class InnerClass {
		
		String myInnerVar = instanceVar;
		//String myInnerVar2 = localVar;
		
	}
	

}
