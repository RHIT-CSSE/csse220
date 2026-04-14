package stateHospitalsB;

public class Hospital {
    int id;
    double latitude;
    double longitude;
    String latestReportAData;
    String latestReportBData;

    public String getPosition() {
        return "(" + latitude + "," + longitude + ")";
    }

    public void setReportA(String data) {
        this.latestReportAData = data;
    }

    public String getReportA() {
        return latestReportAData;
    }

    public void setReportB(String data) {
        this.latestReportBData = data;
    }

    public String getReportB() {
        return latestReportBData;
    }
}
