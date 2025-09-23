package liveCoding;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Cat {
    private static final Color DEFAULT_FACE_COLOR = Color.GRAY;
    private static final Color DEFAULT_ACCENT_COLOR = Color.BLACK;
    private static final int DEFAULT_SIZE = 80;
    private static final int DEFAULT_X = 300;
    private static final int DEFAULT_Y = 200;

    private Color faceColor;
    private Color accentColor; // used for ears, nose, etc.
    private int size;
    private int x;
    private int y;

    /**
     * Default constructor - creates a cat with default size, position, and colors
     */
    public Cat() {
        this.faceColor = DEFAULT_FACE_COLOR;
        this.accentColor = DEFAULT_ACCENT_COLOR;
        this.size = DEFAULT_SIZE;
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
    }

    /**
     * Create a cat with specified size and position, using default colors
     * @param size diameter of cat face
     * @param x x coordinate of center of cat face
     * @param y y coordinate of center of cat face
     */
    public Cat(int size, int x, int y) {
        // TODO
    }

    /**
     * Create a cat with specified size, position, and colors
     * @param size diameter of cat face
     * @param x x coordinate of center of cat face
     * @param y y coordinate of center of cat face
     * @param faceColor the color of the cat's face (background)
     * @param accentColor the color of the cat's other features
     */
    public Cat(int size, int x, int y, Color faceColor, Color accentColor) {
        // TODO
    }

    /**
     * Draw this cat's face, ears, etc. with the provided Graphics2D context
     *
     * @param g2 the Graphics2D context
     */
    public void drawOn(Graphics2D g2) {
        Color oldColor = g2.getColor();
        g2.translate(this.x, this.y);

        // TODO Draw face (circle)

        // TODO Draw nose (triangle at center of face)

        // TODO Draw ears (triangles at top of face)

        // TODO Draw eyes (circles)

        // TODO Draw whiskers (angled lines)

        // Reset g2 color and origin
        g2.setColor(oldColor);
        g2.translate(-this.x, -this.y);
    }

}
