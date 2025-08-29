package rectangle;

/**
 * Class representing a basic rectangle shape with integer dimensions. 
 * Includes methods for computing perimeter, area, and diagonal length. 
 * Not all methods are correctly implemented... 
 * 
 * @author Ian Ludden (luddenig)
 */
public class BasicRectangle {
    
    private int length, width;

    /**
     * Constructs a new basic rectangle with the given length and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @requires length >= 0, width >= 0
     */
    public BasicRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Computes the perimeter of the rectangle. 
     * 
     * @return twice the sum of the length and width
     */
    public int calculatePerimeter() {
        return (this.length + this.width) * 2;
    }

    /**
     * Computes the area of the rectangle. 
     * 
     * @return the product of the length and width
     */
    public int calculateArea() {
        return this.length * this.length;
    }

    /**
     * Computes the length of the rectangle's diagonal. 
     * 
     * @return the length of the hypotenuse of a right triangle with side lengths of this.length and this.width
     */
    public double calculateDiagonalLength() {
        return Math.sqrt(this.length * this.length + this.width * this.length);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[length=" + this.length + ", width=" + this.width + "]";
    }
}
