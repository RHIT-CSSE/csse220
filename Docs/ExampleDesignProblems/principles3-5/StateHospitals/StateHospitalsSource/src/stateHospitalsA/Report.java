package stateHospitalsA;

public class Report {
    String type;
    int hospitalId;
    long arrivalDate;
    String data;

    public double computePartialScoreBasedOnType() {
        // Type switch: bad design preserved
        if ("A".equals(type)) {
            return computePartialScoreForReportA();
        } else if ("B".equals(type)) {
            return computePartialScoreForReportB();
        }
        return 0;
    }

    public double computePartialScoreForReportA() {
        return 30.0; // dummy
    }

    public double computePartialScoreForReportB() {
        return 25.0; // dummy
    }
}
