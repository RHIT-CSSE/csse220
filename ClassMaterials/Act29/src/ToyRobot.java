public class ToyRobot extends LoudToy {
    private int chargeLevel;

    public ToyRobot() {
        super(10);
        this.chargeLevel = 5;
    }

    public void recharge() {
        this.chargeLevel = 10;
    }

    public void makeNoise() {
        System.out.println("Beep Beep!");
    }
}
