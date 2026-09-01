package SmallClassProbs;

import java.util.HashMap;

public class ClassB {
	
	private int data1, data2;
	
	public ClassB(int a, int b) {
		data1 = a;
		data2 = b;
	}
	
	public int sumOfDataPoints() {
		return data1 + data2;
	}
}
