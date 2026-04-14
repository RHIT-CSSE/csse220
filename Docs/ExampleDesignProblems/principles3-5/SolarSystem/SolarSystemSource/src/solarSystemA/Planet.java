package solarSystemA;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    public String planetColor = "blue";
    public double planetComputeData = 1.0;
    private List<Moon> moons = new ArrayList<>();

    public Planet() {
        moons.add(new Moon());
    }

    public void computeNewPosition(double timestamp) {
        planetComputeData += timestamp;
        for (Moon m : moons) {
            m.computeNewPosition(planetComputeData, timestamp);
        }
    }

    public void draw(Object graphics) {
        System.out.println("Drawing planet " + planetColor);
        for (Moon m : moons) {
            m.draw(graphics);
        }
    }

    public List<Moon> getMoons() {
        return moons;
    }
}