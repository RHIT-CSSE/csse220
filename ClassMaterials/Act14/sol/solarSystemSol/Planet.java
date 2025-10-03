package solarSystemSol;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Planet class with optional moons
 * <br>
 * Written with GenAI assistance,
 * <a href="https://claude.ai/share/442cbe6e-5786-4c32-9e2a-c684a9fb1d3c">Claude.AI</a>
 *
 * @author Ian Ludden
 */
public class Planet {
    private final String name;
    private final PlanetComputeData planetComputeData;
    private final List<Moon> moons;

    public Planet(String name, int orbitRadius, double speed, int size) {
        this.name = name;
        this.planetComputeData = new PlanetComputeData(orbitRadius, speed, size);
        this.moons = new ArrayList<>();
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public void computeNewPosition(long timestamp) {
        planetComputeData.updatePosition(timestamp);

        // Update moon positions
        for (Moon moon : moons) {
            moon.computeNewPosition(planetComputeData, timestamp);
        }
    }

    public void draw(Graphics graphics, Color planetColor, Color moonColor, boolean showNames) {
        int x = planetComputeData.getX();
        int y = planetComputeData.getY();
        int size = planetComputeData.getSize();

        // Draw planet
        graphics.setColor(planetColor);
        graphics.fillOval(x - size/2, y - size/2, size, size);

        // Draw planet name as tooltip above the planet if showNames is true
        if (showNames) {
            graphics.setColor(Color.WHITE);
            graphics.drawString(name, x - size/2, y - size/2 - 5);
        }

        // Draw moons
        for (Moon moon : moons) {
            moon.draw(graphics, moonColor, showNames);
        }
    }

    public void setPlanetColor(Color newColor) {
        // Method retained for compatibility, but no longer stores planetColor
    }

    public List<Moon> getMoons() {
        return moons;
    }

}


// Helper class for planet position and movement data
class PlanetComputeData {
    private final int orbitRadius;
    private final double speed;
    private final int size;
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
        x = (int)(400 + orbitRadius * Math.cos(angle));
        y = (int)(300 + orbitRadius * Math.sin(angle));
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getSize() { return size; }
}