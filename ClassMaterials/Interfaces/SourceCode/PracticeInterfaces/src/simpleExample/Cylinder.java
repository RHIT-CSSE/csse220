package simpleExample;

/**
 *  Cylinder class has a radius and side length and then its weight is calculated using the
 *  volume and a constant volume to weight ratio which is the same for all cylinders
 * 
 * @author Jason Yoder
 *
 */
public class Cylinder {

	public static final double VOLUME_TO_WEIGHT_RATIO = 0.0002;
	private double sideLength, radius;
	
	public Cylinder( double sideLength, double radius) {
		this.sideLength = sideLength;
		this.radius = radius;
	}
	
	public double calculateWeightInTons() {
		double volume = sideLength * Math.PI*Math.pow(this.radius, 2);
		return volume * VOLUME_TO_WEIGHT_RATIO;
	}
	
	@Override
	public String toString() {
		return "Cylinder[s="+this.sideLength+",r="+this.radius+"]";
	}
}
