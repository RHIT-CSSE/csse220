package shapes;

/**
 * Here we implement the functions from the Shape interface that
 * we can implement without knowing the specific shape
 * @author anderson
 *
 */
public abstract class AbstractShape implements Shape

{
    public abstract double getArea( );
    public abstract double getPerimeter( );
 
    /**
     * Even though this class does not know how to compute any areas,
     * polymorphism lets us call area() from this class.
     */   
    @Override
    public int compareTo( Shape rhs ) {
        double diff = this.getArea( ) - rhs.getArea( );
        if( diff == 0 )
            return 0;
        else if( diff < 0 )
            return -1;
        else
            return 1;
    }
   
    /**
     * Even though this class does not know how to compute any perimeters,
     * polymorphism lets us call perimeter() from this class.
     */
    @Override
    public double getSemiPerimeter( ) {
        return this.getPerimeter( ) / 2; 
    }
}
