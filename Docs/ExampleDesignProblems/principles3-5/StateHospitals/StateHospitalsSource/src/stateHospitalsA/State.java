package stateHospitalsA;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class State {
    int id;
    String roadDataForDrawing;
    String borderDataForDrawing;
    HashMap<Integer, Double> hospitalLatitude = new HashMap<>();
    HashMap<Integer, Double> hospitalLongitude = new HashMap<>();

    List<Report> reports = new ArrayList<>();

    public void addReport(int hospitalId, String type, String data) {
        Report r = new Report();
        r.hospitalId = hospitalId;
        r.type = type;
        r.data = data;
        r.arrivalDate = System.currentTimeMillis();
        reports.add(r);
        // Also store dummy lat/long if new hospital
        hospitalLatitude.putIfAbsent(hospitalId, 0.0);
        hospitalLongitude.putIfAbsent(hospitalId, 0.0);
    }

    public double computeAggregateScore(int hospitalId) {
        double sum = 0;
        for (Report r : reports) {
            if (r.hospitalId == hospitalId) {
                sum += r.computePartialScoreBasedOnType();
            }
        }
        return sum;
    }

    public String computeColorForScore(double score) {
        // Dummy: high score = green, else red
        return score > 50 ? "GREEN" : "RED";
    }

    public void drawHospital(Graphics graphics, int hospitalId) {
        double score = computeAggregateScore(hospitalId);
        String color = computeColorForScore(score);
        Double lat = hospitalLatitude.get(hospitalId);
        Double lon = hospitalLongitude.get(hospitalId);
        System.out.println("Drawing hospital " + hospitalId + " at (" + lat + "," + lon + ") color=" + color);
    }

    public void drawMap(Graphics graphics) {
        System.out.println("Drawing borders: " + borderDataForDrawing);
        System.out.println("Drawing roads: " + roadDataForDrawing);
        for (Integer hid : hospitalLatitude.keySet()) {
            drawHospital(graphics, hid);
        }
    }
}
