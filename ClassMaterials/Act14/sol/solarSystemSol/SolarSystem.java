package solarSystemSol;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Solar system containing planets.
 * <br>
 * Written with GenAI assistance,
 * <a href="https://claude.ai/share/442cbe6e-5786-4c32-9e2a-c684a9fb1d3c">Claude.AI</a>
 *
 * @author Ian Ludden
 */
public class SolarSystem {
    private static final Color DEFAULT_PLANET_COLOR = new Color(169, 169, 169); // Gray
    private static final Color DEFAULT_MOON_COLOR = new Color(255, 198, 73); // Yellow-orange
    private Color planetColor;
    private Color moonColor;
    private final ArrayList<Planet> planets;

    public SolarSystem() {
        planetColor = DEFAULT_PLANET_COLOR;
        moonColor = DEFAULT_MOON_COLOR;
        planets = new ArrayList<>();
        initializePlanets();
    }

    private void initializePlanets() {
        planets.add(createMercury());
        planets.add(createVenus());
        planets.add(createEarth()); // Earth with Moon
        planets.add(createMars()); // Mars with Phobos and Deimos
        planets.add(createJupiter()); // Jupiter with major moons
        planets.add(createSaturn()); // Saturn with major moons
        planets.add(createUranus()); // Uranus with major moons
        planets.add(createNeptune()); // Neptune with Triton
    }

    private Planet createMercury() {
        return new Planet("Mercury", 80, 0.02, 8);
    }

    private Planet createVenus() {
        return new Planet("Venus", 110, 0.015, 12);
    }

    private Planet createEarth() {
        Planet earth = new Planet("Earth", 150, 0.01, 15);
        earth.addMoon(new Moon("Moon", 30, 0.05, 4));
        return earth;
    }

    private Planet createMars() {
        Planet mars = new Planet("Mars", 200, 0.008, 10);
        mars.addMoon(new Moon("Phobos", 20, 0.08, 2));
        mars.addMoon(new Moon("Deimos", 25, 0.06, 1));
        return mars;
    }

    private Planet createJupiter() {
        Planet jupiter = new Planet("Jupiter", 280, 0.005, 30);
        jupiter.addMoon(new Moon("Io", 40, 0.07, 3));
        jupiter.addMoon(new Moon("Europa", 50, 0.055, 3));
        jupiter.addMoon(new Moon("Ganymede", 60, 0.04, 4));
        jupiter.addMoon(new Moon("Callisto", 70, 0.03, 3));
        return jupiter;
    }

    private Planet createSaturn() {
        Planet saturn = new Planet("Saturn", 350, 0.003, 25);
        saturn.addMoon(new Moon("Titan", 45, 0.045, 4));
        saturn.addMoon(new Moon("Enceladus", 35, 0.06, 2));
        saturn.addMoon(new Moon("Mimas", 30, 0.08, 2));
        return saturn;
    }

    private Planet createUranus() {
        Planet uranus = new Planet("Uranus", 420, 0.002, 20);
        uranus.addMoon(new Moon("Titania", 40, 0.04, 3));
        uranus.addMoon(new Moon("Oberon", 35, 0.05, 3));
        uranus.addMoon(new Moon("Ariel", 30, 0.06, 2));
        return uranus;
    }

    private Planet createNeptune() {
        Planet neptune = new Planet("Neptune", 480, 0.001, 18);
        neptune.addMoon(new Moon("Triton", 35, 0.04, 3));
        return neptune;
    }

    public void setPlanetColor(Color newColor) {
        this.planetColor = newColor;
    }

    public void setMoonColor(Color newColor) {
        this.moonColor = newColor;
    }

    public void computeNewPosition(long timestamp) {
        for (Planet planet : planets) {
            planet.computeNewPosition(timestamp);
        }
    }

    public void drawAll(Graphics graphics, boolean showNames) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(390, 290, 20, 20);
        for (Planet planet : planets) {
            planet.draw(graphics, planetColor, moonColor, showNames);
        }
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }
}
