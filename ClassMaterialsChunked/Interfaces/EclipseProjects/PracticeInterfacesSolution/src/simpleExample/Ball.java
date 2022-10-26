package simpleExample;

/**
  *  Ball class has a radius and then its weight is calculated using the
  *  volume and a constant volume to weight ratio which is the same for all balls
  * 
  *  @author Jason Yoder
  */
public class Ball implements Weighable {
	
	public static final double VOLUME_TO_WEIGHT_RATIO =0.1;
	private double radius;
	
	public Ball(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateWeightInLbs() {
		double volume = Math.PI * 4/3 *Math.pow(radius, 3);
		return volume*VOLUME_TO_WEIGHT_RATIO;
	}
	
	@Override
	public String toString() {
		return "Ball[r="+this.radius+"]";
	}
	
	
}
