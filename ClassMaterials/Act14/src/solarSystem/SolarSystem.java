package solarSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Solar system containing planets.
 * <br>
 * Written with GenAI assistance,
 * <a href="https://claude.ai/share/442cbe6e-5786-4c32-9e2a-c684a9fb1d3c">Claude.AI</a>
 *
 * @author Ian Ludden
 */
public class SolarSystem {
    private final List<Planet> planets;

    public SolarSystem() {
        planets = new ArrayList<>();
        initializePlanets();
    }

    private void initializePlanets() {
        // Create 8 planets with realistic colors and positions
        planets.add(new Planet("Mercury", new Color(169, 169, 169), 80, 0.02, 8)); // Gray - no moons
        planets.add(new Planet("Venus", new Color(255, 198, 73), 110, 0.015, 12)); // Yellow-orange - no moons
        planets.add(createEarth()); // Earth with Moon
        planets.add(createMars()); // Mars with Phobos and Deimos
        planets.add(createJupiter()); // Jupiter with major moons
        planets.add(createSaturn()); // Saturn with major moons
        planets.add(createUranus()); // Uranus with major moons
        planets.add(createNeptune()); // Neptune with Triton
    }

    private Planet createEarth() {
        Planet earth = new Planet("Earth", new Color(100, 149, 237), 150, 0.01, 15);
        earth.addMoon(new Moon("Moon", Color.LIGHT_GRAY, 30, 0.05, 4));
        return earth;
    }

    private Planet createMars() {
        Planet mars = new Planet("Mars", new Color(205, 92, 92), 200, 0.008, 10);
        mars.addMoon(new Moon("Phobos", Color.DARK_GRAY, 20, 0.08, 2));
        mars.addMoon(new Moon("Deimos", Color.GRAY, 25, 0.06, 1));
        return mars;
    }

    private Planet createJupiter() {
        Planet jupiter = new Planet("Jupiter", new Color(255, 165, 0), 280, 0.005, 30);
        jupiter.addMoon(new Moon("Io", Color.YELLOW, 40, 0.07, 3));
        jupiter.addMoon(new Moon("Europa", Color.WHITE, 50, 0.055, 3));
        jupiter.addMoon(new Moon("Ganymede", Color.LIGHT_GRAY, 60, 0.04, 4));
        jupiter.addMoon(new Moon("Callisto", Color.DARK_GRAY, 70, 0.03, 3));
        return jupiter;
    }

    private Planet createSaturn() {
        Planet saturn = new Planet("Saturn", new Color(250, 230, 143), 350, 0.003, 25);
        saturn.addMoon(new Moon("Titan", Color.ORANGE, 45, 0.045, 4));
        saturn.addMoon(new Moon("Enceladus", Color.WHITE, 35, 0.06, 2));
        saturn.addMoon(new Moon("Mimas", Color.LIGHT_GRAY, 30, 0.08, 2));
        return saturn;
    }

    private Planet createUranus() {
        Planet uranus = new Planet("Uranus", new Color(64, 224, 208), 420, 0.002, 20);
        uranus.addMoon(new Moon("Titania", Color.LIGHT_GRAY, 40, 0.04, 3));
        uranus.addMoon(new Moon("Oberon", Color.GRAY, 35, 0.05, 3));
        uranus.addMoon(new Moon("Ariel", Color.LIGHT_GRAY, 30, 0.06, 2));
        return uranus;
    }

    private Planet createNeptune() {
        Planet neptune = new Planet("Neptune", new Color(30, 144, 255), 480, 0.001, 18);
        neptune.addMoon(new Moon("Triton", Color.LIGHT_GRAY, 35, 0.04, 3));
        return neptune;
    }

    public void computeNewPosition(long timestamp) {
        for (Planet planet : planets) {
            planet.computeNewPosition(timestamp);
        }
    }

    public void drawAll(Graphics graphics) {
        // Draw sun
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(390, 290, 20, 20);

        for (Planet planet : planets) {
            planet.draw(graphics);
        }
    }

    public List<Planet> getPlanets() {
        return planets;
    }
}
