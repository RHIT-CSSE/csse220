package stateHospitalsB;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

public class StateData {
    int id;
    StateMap stateMap = new StateMap();
    Map<Integer, Hospital> hospitals = new HashMap<>();

    public void updateReport(int hospitalId, String type, String data) {
        Hospital h = hospitals.get(hospitalId);
        if (h == null) {
            h = new Hospital();
            h.id = hospitalId;
            hospitals.put(hospitalId, h);
        }
        // Flaw: StateData modifies Hospital's data instead of Hospital doing it
        if ("A".equals(type)) {
            h.setReportA(data);
        } else if ("B".equals(type)) {
            h.setReportB(data);
        }
    }

    public double computePartialScoreForReportA(String dataA) {
        return dataA == null ? 0 : 30.0; // dummy
    }

    public double computePartialScoreForReportB(String dataB) {
        return dataB == null ? 0 : 25.0; // dummy
    }

    public double computeAggregateScore(int hospitalId) {
        Hospital h = hospitals.get(hospitalId);
        if (h == null) return 0;
        // Flaw: StateData reaches into Hospital to get data, computes score itself
        double scoreA = computePartialScoreForReportA(h.getReportA());
        double scoreB = computePartialScoreForReportB(h.getReportB());
        return scoreA + scoreB;
    }

    public void drawMap(Graphics graphics) {
        stateMap.drawMap(graphics);
        for (Hospital h : hospitals.values()) {
            double score = computeAggregateScore(h.id);
            String position = h.getPosition();
            stateMap.drawHospital(graphics, position, score);
        }
    }
}