//package liveCoding;
//
//import java.awt.Color;
//import java.awt.Graphics2D;
//import java.awt.Polygon;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Line2D;
//
//public class Cat {
//    private static final Color DEFAULT_FACE_COLOR = Color.GRAY;
//    private static final Color DEFAULT_ACCENT_COLOR = Color.BLACK;
//    private static final int DEFAULT_SIZE = 80;
//    private static final int DEFAULT_X = 300;
//    private static final int DEFAULT_Y = 200;
//
//    private Color faceColor;
//    private Color accentColor; // used for ears, nose, etc.
//    private int size;
//    private int x;
//    private int y;
//
//    /**
//     * Default constructor - creates a cat with default size, position, and colors
//     */
//    public Cat() {
//        this.faceColor = DEFAULT_FACE_COLOR;
//        this.accentColor = DEFAULT_ACCENT_COLOR;
//        this.size = DEFAULT_SIZE;
//        this.x = DEFAULT_X;
//        this.y = DEFAULT_Y;
//    }
//
//    /**
//     * Create a cat with specified size and position, using default colors
//     * @param size diameter of cat face
//     * @param x x coordinate of center of cat face
//     * @param y y coordinate of center of cat face
//     */
//    public Cat(int size, int x, int y) {
//        this();
//        this.size = size;
//        this.x = x;
//        this.y = y;
//    }
//
//    /**
//     * Create a cat with specified size, position, and colors
//     * @param size diameter of cat face
//     * @param x x coordinate of center of cat face
//     * @param y y coordinate of center of cat face
//     * @param faceColor the color of the cat's face (background)
//     * @param accentColor the color of the cat's other features
//     */
//    public Cat(int size, int x, int y, Color faceColor, Color accentColor) {
//        this(size, x, y);
//        this.faceColor = faceColor;
//        this.accentColor = accentColor;
//    }
//
//    /**
//     * Draw this cat's face, ears, etc. with the provided Graphics2D context
//     *
//     * @param g2 the Graphics2D context
//     */
//    public void drawOn(Graphics2D g2) {
//        Color oldColor = g2.getColor();
//        g2.translate(this.x, this.y);
//
//        // Draw face
//        double radius = (double )this.size / 2;
//        Ellipse2D face = new Ellipse2D.Double(-radius, -radius, this.size, this.size);
//        g2.setColor(this.faceColor);
//        g2.fill(face);
//
//        g2.setColor(this.accentColor);
//
//        // Draw nose (triangle at center of face)
//        Polygon nose = new Polygon();
//        int noseHeight = this.size / 10;
//        int noseWidth = this.size / 10;
//        nose.addPoint(0, noseHeight);
//        nose.addPoint(-noseWidth / 2, 0);
//        nose.addPoint(noseWidth / 2, 0);
//        g2.fill(nose);
//
//        // Draw ears (triangles at top of face)
//        Polygon leftEar = new Polygon();
//        leftEar.addPoint(-this.size / 2, -this.size / 2);
//        leftEar.addPoint(-this.size * 2 / 5, -this.size / 6);
//        leftEar.addPoint(-this.size / 6, -this.size * 2 / 5);
//        g2.fill(leftEar);
//        Polygon rightEar = new Polygon();
//        // Copy left ear points, mirrored
//        for (int i = 0; i < leftEar.npoints; i++) {
//            rightEar.addPoint(-leftEar.xpoints[i], leftEar.ypoints[i]);
//        }
//        g2.fill(rightEar);
//
//        // Draw eyes (circles)
//        double eyeRadius = (double) this.size / 20;
//        double eyeOffset = (double) this.size / 8;
//        Ellipse2D.Double leftEye = new Ellipse2D.Double(-eyeOffset - eyeRadius, -eyeOffset - eyeRadius, 2 * eyeRadius, 2 * eyeRadius);
//        Ellipse2D.Double rightEye = new Ellipse2D.Double(eyeOffset - eyeRadius, -eyeOffset - eyeRadius, 2 * eyeRadius, 2 * eyeRadius);
//        g2.fill(leftEye);
//        g2.fill(rightEye);
//
//        // Draw whiskers (angled lines)
//        int whiskerLength = this.size / 4;
//        int whiskerOffsetX = this.size / 10;
//        int whiskerOffsetY = this.size / 10;
//        int whiskerAngle = 15; // degrees
//
//        Line2D whisker = new Line2D.Double(-whiskerOffsetX, 0, -whiskerOffsetX - whiskerLength, 0);
//
//        g2.translate(0, whiskerOffsetY); // put whiskers below nose
//
//        int[] whiskerAngles = {-whiskerAngle, 0, whiskerAngle, 180 - whiskerAngle, 180, 180 + whiskerAngle};
//        for (int angle : whiskerAngles) {
//            g2.rotate(Math.toRadians(angle));
//            g2.draw(whisker);
//            g2.rotate(-Math.toRadians(angle)); // reset rotation
//        }
//
//        g2.translate(0, -whiskerOffsetY); // reset translation
//
//        // Reset g2 color and origin
//        g2.setColor(oldColor);
//        g2.translate(-this.x, -this.y);
//    }
//
//}
