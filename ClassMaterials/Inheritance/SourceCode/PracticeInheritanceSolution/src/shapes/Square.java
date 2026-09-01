package shapes; 

/**
 * A square is a special case of rRectangle, so this code is very simple.
 * @author anderson, modifying an example by Mark Weiss.
 *
 */
public class Square extends Rectangle  {
    public Square( double side ) {
        super( side, side );
    }
    
    public String toString( ) {
        return "Square: " + this.getLength( );
    }
}
