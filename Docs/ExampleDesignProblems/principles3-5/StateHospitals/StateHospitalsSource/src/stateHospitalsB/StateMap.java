package stateHospitalsB;

import java.awt.Graphics;

public class StateMap {
    String roadDataForDrawing;
    String borderDataForDrawing;

    public String computeColorForScore(double score) {
        return score > 50 ? "GREEN" : "RED";
    }

    public void drawHospital(Graphics graphics, String position, double score) {
        String color = computeColorForScore(score);
        System.out.println("Drawing hospital at " + position + " color=" + color);
    }

    public void drawMap(Graphics graphics) {
        System.out.println("Drawing borders: " + borderDataForDrawing);
        System.out.println("Drawing roads: " + roadDataForDrawing);
    }
}
