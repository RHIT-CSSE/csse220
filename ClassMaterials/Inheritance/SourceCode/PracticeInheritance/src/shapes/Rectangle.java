package shapes;

/**
 * Another shape implementation example
 * @author anderson, modifying code by Mark Weiss
 *
 */
public class Rectangle extends AbstractShape {
	
	private double length;
	private double width;
	
    public Rectangle( double len, double wid ) {
        this.length = len; this.width = wid;
    }
     
    @Override
    public double getArea( )  {
        return this.length * this.width;
    }
    
    @Override
    public double getPerimeter( ) {
        return 2 * ( this.length + this.width );
    }
    
    @Override
    public String toString( ) {
        return "Rectangle: " + this.length + " " + this.width;
    }
    
    public double getLength( ) {
        return this.length;
    }
    
    public double getWidth( ) {
        return this.width;
    }
}
