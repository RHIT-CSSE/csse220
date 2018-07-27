package simpleExample;

public class Data { //STEP THREE, LAST STEP
	
	public static double average(Measurable[] objs) {
		double sum = 0.0;
		for(Measurable obj : objs) {
			sum += obj.getMeasure();
		}
		return sum/objs.length;
	}

}
