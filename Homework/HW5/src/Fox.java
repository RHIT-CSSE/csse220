import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 * Class representing a fox, drawn as a triangular face with triangular ears.
 *
 * @author YOUR NAME HERE
 * <br>
 * **************************************************************************************
 * REQUIRED HELP CITATION
 *         TODO: cite your help here or say "only used CSSE220 materials"
 * **************************************************************************************
 */
public class Fox {
    private static final int HEIGHT = 50;
    private static final int WIDTH = 100;

    private static final int EAR_HEIGHT = 20;
    private static final int EAR_WIDTH = 20;
    private static final Color EAR_COLOR = Color.BLACK;

    // Color of the fox's face
    private Color color;

    // Coordinates for the fox's position, as the top-left corner of the face
    private int x;
    private int y;

    public Fox(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawOn(Graphics2D g2) {
        // Move the origin of the graphics context to the fox's position
        g2.translate(x, y);

        // Draw the fox face
        int[] xPoints = {0, WIDTH / 2, WIDTH};
        int[] yPoints = {0, HEIGHT, 0};

        // TODO: Construct a Polygon for the fox face, then fill it with the fox's color.

        // Draw the fox ears
        int[] leftEarXPoints = {0, EAR_WIDTH / 2, EAR_WIDTH};
        int[] leftEarYPoints = {0, -EAR_HEIGHT, 0};

        int[] rightEarXPoints = {WIDTH - EAR_WIDTH, WIDTH - EAR_WIDTH / 2, WIDTH};
        int[] rightEarYPoints = {0, -EAR_HEIGHT, 0};

        // TODO: Construct Polygons for the left and right ears, then fill them with EAR_COLOR.

        // Undo translation
        g2.translate(-x, -y);
    }

}
