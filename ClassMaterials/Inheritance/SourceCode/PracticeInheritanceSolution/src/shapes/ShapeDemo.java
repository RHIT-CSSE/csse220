package shapes;

/**
 * Illustrate polymorphism and inheritance, using several Shape classes.
 * @author Claude Anderson, modifying code by Mark Weiss
 *
 */
class ShapeDemo {
	
	public static void main( String [ ] args ) {
	        Shape [ ] a = { new Circle( 2.0 ), new Rectangle( 1.0, 3.0 ),
	                        null, new Square( 2.0 ) };
	       
	        System.out.println( "Total area = " + totalArea( a ) );
	        System.out.println( "Total semiperimeter = " + totalSemiperimeter( a ) );
	        printAll( a );
	}
	
    public static double totalArea( Shape [ ] arr ) {
        double total = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[ i ] != null )
                total += arr[ i ].getArea( );
        }
        return total;
    }

    public static double totalSemiperimeter( Shape [ ] arr ) {
        double total = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[ i ] != null )
                total += arr[ i ].getSemiPerimeter( );
        }
        return total;
    }
    
    public static void printAll( Shape [ ] arr ) {
        for( int i = 0; i < arr.length; i++ )
            System.out.println( arr[ i ] );
    }
    
 
}
