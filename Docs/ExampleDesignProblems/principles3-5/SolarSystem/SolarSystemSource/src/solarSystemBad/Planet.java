package solarSystemBad;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a planet orbiting the sun, possibly with moons in its own orbit.
 * <br>
 * Orbital mechanics are handled by the inner PlanetComputeData class.
 *
 * @author Ian Ludden
 */
public class Planet {
    private String name;
    private Color planetColor;
    private PlanetComputeData planetComputeData;
    private List<Moon> moons;

    public Planet(String name, Color color, int orbitRadius, double speed, int size) {
        this.name = name;
        this.planetColor = color;
        this.planetComputeData = new PlanetComputeData(orbitRadius, speed, size);
        this.moons = new ArrayList<>();
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public void computeNewPosition(long timestamp) {
        planetComputeData.updatePosition(timestamp);
        for (Moon moon : moons) {
            moon.computeNewPosition(planetComputeData, timestamp);
        }
    }

    public void draw(Graphics graphics) {
        int x = planetComputeData.getX();
        int y = planetComputeData.getY();
        int size = planetComputeData.getSize();

        graphics.setColor(planetColor);
        graphics.fillOval(x - size / 2, y - size / 2, size, size);

        for (Moon moon : moons) {
            moon.draw(graphics);
        }
    }

    public void setPlanetColor(Color newColor) {
        this.planetColor = newColor;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public PlanetComputeData getPlanetComputeData() {
        return planetComputeData;
    }

    static class PlanetComputeData {
        private int orbitRadius;
        private double speed;
        private int size;
        private double angle;
        private int x, y;

        public PlanetComputeData(int orbitRadius, double speed, int size) {
            this.orbitRadius = orbitRadius;
            this.speed = speed;
            this.size = size;
            this.angle = 0;
        }

        public void updatePosition(long timestamp) {
            angle = (timestamp * speed) % (2 * Math.PI);
            x = (int) (SolarSystemMain.DEFAULT_FRAME_WIDTH / 2.0 + orbitRadius * Math.cos(angle));
            y = (int) (SolarSystemMain.DEFAULT_FRAME_HEIGHT / 2.0 + orbitRadius * Math.sin(angle));
        }

        public int getX() { return x; }
        public int getY() { return y; }
        public int getSize() { return size; }
    }
}
