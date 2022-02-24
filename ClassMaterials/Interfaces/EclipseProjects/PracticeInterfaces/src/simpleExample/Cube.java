package simpleExample;

/**
 *  Cube class has a side and then its weight is calculated using the
 *  volume and a constant volume to weight ratio which is the same for all cubes
 * 
 * @author Jason Yoder
 *
 */
public class Cube {

	public static final double VOLUME_TO_MASS_RATIO =0.2;
	private double sideLength;
	
	public Cube( double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getMassInKG() {
		double volume = Math.pow(this.sideLength, 3);
		return volume * VOLUME_TO_MASS_RATIO;
	}
	
	@Override
	public String toString() {
		return "Cube[s="+this.sideLength+"]";
	}
}
