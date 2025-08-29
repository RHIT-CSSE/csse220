package point;

/**
 * Simple class representing a 2D point. 
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        // System.out.println(Point.distanceBetween(a, b));
        // System.out.println(a.distanceTo(b));
    }
}
