package solarSystemA;

public class SolarSystemMain {
    private SolarSystem solarSystem = new SolarSystem();

    public void handleComputeNewPosition(double timestamp) {
        solarSystem.computeNewPosition(timestamp);
    }

    public void handleDrawAll(Object graphics) {
        solarSystem.drawAll(graphics);
    }

    public void handleUpdatePlanetColor(String newColor) {
        for (Planet p : solarSystem.getPlanets()) {
            p.planetColor = newColor;
        }
    }

    public void handleUpdateMoonColor(String newColor) {
        for (Planet p : solarSystem.getPlanets()) {
            for (Moon m : p.getMoons()) {
                m.moonColor = newColor;
            }
        }
    }

    public static void main(String[] args) {
        SolarSystemMain app = new SolarSystemMain();
        app.handleComputeNewPosition(1.0);
        app.handleDrawAll(null);
        app.handleUpdatePlanetColor("red");
        app.handleUpdateMoonColor("white");
        app.handleDrawAll(null);
    }
}