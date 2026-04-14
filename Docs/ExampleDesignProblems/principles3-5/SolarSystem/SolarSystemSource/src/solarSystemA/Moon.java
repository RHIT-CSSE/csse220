package solarSystemA;

public class Moon {
    public double moonComputeData = 0.5;
    public String moonColor = "gray";

    public void computeNewPosition(double planetComputeData, double timestamp) {
        moonComputeData = planetComputeData + timestamp;
    }

    public void draw(Object graphics) {
        System.out.println("Drawing moon " + moonColor);
    }
}