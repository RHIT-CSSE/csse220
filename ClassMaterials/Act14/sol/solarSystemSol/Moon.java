package solarSystemSol;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Moon class
 * <br>
 * Written with GenAI assistance,
 * <a href="https://claude.ai/share/442cbe6e-5786-4c32-9e2a-c684a9fb1d3c">Claude.AI</a>
 *
 * @author Ian Ludden
 */
public class Moon {
    private final String name;
    private final MoonComputeData moonComputeData;

    public Moon(String name, int orbitRadius, double speed, int size) {
        this.name = name;
        this.moonComputeData = new MoonComputeData(orbitRadius, speed, size);
    }

    public void computeNewPosition(PlanetComputeData planetComputeData, long timestamp) {
        moonComputeData.updatePosition(planetComputeData, timestamp);
    }

    public void draw(Graphics graphics, Color moonColor, boolean showNames) {
        int x = moonComputeData.getX();
        int y = moonComputeData.getY();
        int size = moonComputeData.getSize();

        // Draw moon
        graphics.setColor(moonColor);
        graphics.fillOval(x - size/2, y - size/2, size, size);

        // Draw moon name as tooltip above the moon if showNames is true
        if (showNames) {
            graphics.setColor(Color.WHITE);
            graphics.drawString(name, x - size/2, y - size/2 - 5);
        }
    }

    public void setMoonColor(Color newColor) {
        // Method retained for compatibility, but no longer stores moonColor
    }
}


// Helper class for moon position and movement data
class MoonComputeData {
    private final int orbitRadius;
    private final double speed;
    private final int size;
    private double angle;
    private int x, y;

    public MoonComputeData(int orbitRadius, double speed, int size) {
        this.orbitRadius = orbitRadius;
        this.speed = speed;
        this.size = size;
        this.angle = 0;
    }

    public void updatePosition(PlanetComputeData planetComputeData, long timestamp) {
        angle = (timestamp * speed) % (2 * Math.PI);
        x = (int)(planetComputeData.getX() + orbitRadius * Math.cos(angle));
        y = (int)(planetComputeData.getY() + orbitRadius * Math.sin(angle));
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getSize() { return size; }
}