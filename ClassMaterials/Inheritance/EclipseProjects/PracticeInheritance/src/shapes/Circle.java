package shapes;

/** An example of a Shape class 
 * 
 * @author anderson
 *
 */
public class Circle extends AbstractShape {
	
	private double radius;
	
    public Circle( double rad ) {
        this.radius = rad;
    }
    
    @Override
    public double getArea( ) {
        return Math.PI * this.radius * this.radius;
    }
    
    @Override
    public double getPerimeter( ) {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString( ) {
        return "Circle: " + this.radius;
    }
}
