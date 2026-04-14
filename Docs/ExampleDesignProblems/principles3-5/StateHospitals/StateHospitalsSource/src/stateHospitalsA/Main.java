package stateHospitalsA;

import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Integer, State> states = new HashMap<>();

    public void handleReportSubmission(int stateId, int hospitalId, String type, String data) {
        State state = states.get(stateId);
        if (state == null) {
            state = new State();
            state.id = stateId;
            states.put(stateId, state);
        }
        state.addReport(hospitalId, type, data);
    }

    public void handleDrawMap(int stateId) {
        State state = states.get(stateId);
        if (state != null) {
            state.drawMap(null); // pass null Graphics for demo
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        //God class State does everything
        main.handleReportSubmission(1, 100, "A", "someDataA");
        main.handleReportSubmission(1, 100, "B", "someDataB");
        main.handleReportSubmission(1, 101, "A", "otherDataA");
        main.handleDrawMap(1);
        System.out.println("Map drawn (see State doing all the work).");
    }
}