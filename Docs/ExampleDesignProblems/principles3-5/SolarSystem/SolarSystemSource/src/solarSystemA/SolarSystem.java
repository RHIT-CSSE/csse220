package solarSystemA;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets = new ArrayList<>();

    public SolarSystem() {
        for (int i = 0; i < 8; i++) {
            planets.add(new Planet());
        }
    }

    public void computeNewPosition(double timestamp) {
        for (Planet p : planets) {
            p.computeNewPosition(timestamp);
        }
    }

    public void drawAll(Object graphics) {
        for (Planet p : planets) {
            p.draw(graphics);
        }
    }

    public List<Planet> getPlanets() {
        return planets;
    }
}
