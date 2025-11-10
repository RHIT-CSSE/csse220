public abstract class LoudToy {
    private int volume;

    public LoudToy(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        this.makeNoise();
    }

    public abstract void makeNoise();

    public static void main(String[] args) {
        LoudToy sheep = new ToySheep();
        sheep.makeNoise(); // Output: Baaa
        sheep.setVolume(5); // Output: Baaa

        LoudToy robot = new ToyRobot();
        robot.makeNoise(); // Output: Beep Beep!
        robot.setVolume(8); // Output: Beep Beep!
        ((ToyRobot) robot).recharge();
    }
}