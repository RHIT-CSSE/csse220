package stateHospitalsB;

import java.util.HashMap;
import java.util.Map;

public class Main {
    Map<Integer, StateData> stateDatas = new HashMap<>();

    public void handleReportSubmission(int stateId, int hospitalId, String type, String data) {
        StateData sd = stateDatas.get(stateId);
        if (sd == null) {
            sd = new StateData();
            sd.id = stateId;
            stateDatas.put(stateId, sd);
        }
        sd.updateReport(hospitalId, type, data);
    }

    public void handleDrawMap(int stateId) {
        StateData sd = stateDatas.get(stateId);
        if (sd != null) {
            sd.drawMap(null);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        // Flaw: StateData reaches into Hospital to get/set data, then does all computation
        main.handleReportSubmission(1, 100, "A", "dataA1");
        main.handleReportSubmission(1, 100, "B", "dataB1");
        main.handleReportSubmission(1, 101, "A", "dataA2");
        main.handleDrawMap(1);
        System.out.println("Map drawn (StateData does all work, Hospital is just a data bag).");
    }
}
