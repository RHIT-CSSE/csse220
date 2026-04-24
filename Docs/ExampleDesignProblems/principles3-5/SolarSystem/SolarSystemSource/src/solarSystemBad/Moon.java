package solarSystemBad;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents a moon orbiting a planet in the solar system.
 * <br>
 * Orbital mechanics are handled by the inner MoonComputeData class.
 *
 * @author Ian Ludden
 */
public class Moon {
    private String name;
    private Color moonColor;
    private MoonComputeData moonComputeData;

    public Moon(String name, Color color, int orbitRadius, double speed, int size) {
        this.name = name;
        this.moonColor = color;
        this.moonComputeData = new MoonComputeData(orbitRadius, speed, size);
    }

    public void computeNewPosition(Planet.PlanetComputeData planetComputeData, long timestamp) {
        moonComputeData.updatePosition(planetComputeData, timestamp);
    }

    public void draw(Graphics graphics) {
        int x = moonComputeData.getX();
        int y = moonComputeData.getY();
        int size = moonComputeData.getSize();

        graphics.setColor(moonColor);
        graphics.fillOval(x - size / 2, y - size / 2, size, size);
    }

    public void setMoonColor(Color newColor) {
        this.moonColor = newColor;
    }

    private static class MoonComputeData {
        private int orbitRadius;
        private double speed;
        private int size;
        private double angle;
        private int x, y;

        public MoonComputeData(int orbitRadius, double speed, int size) {
            this.orbitRadius = orbitRadius;
            this.speed = speed;
            this.size = size;
            this.angle = 0;
        }

        public void updatePosition(Planet.PlanetComputeData planetComputeData, long timestamp) {
            angle = (timestamp * speed) % (2 * Math.PI);
            x = (int) (planetComputeData.getX() + orbitRadius * Math.cos(angle));
            y = (int) (planetComputeData.getY() + orbitRadius * Math.sin(angle));
        }

        public int getX() { return x; }
        public int getY() { return y; }
        public int getSize() { return size; }
    }
}
