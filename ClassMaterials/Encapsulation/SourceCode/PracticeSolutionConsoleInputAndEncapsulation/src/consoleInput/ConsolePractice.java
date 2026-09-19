package consoleInput;

import java.util.Scanner;

/**
 * This class prompts the user for a velocity, acceleration, and elapsed time.
 * It then reports the resulting change in position,
 * according to frictionless, drag-free, one-dimensional kinematics.
 *
 * @author Ian Ludden
 */
public class ConsolePractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a goodbye message: ");
        String goodbyeMessage = "";
        // DONE read and store the goodbye message provided by the user
        goodbyeMessage = in.nextLine();
        System.out.println();

        System.out.print("Enter a velocity, in m/s: ");
        // DONE read and store the velocity provided by the user
        // Name your local variable "velocity"
        double velocity = in.nextDouble();
        System.out.println();

        System.out.print("Enter an acceleration, in m/s^2: ");
        // DONE read and store the acceleration provided by the user
        // Name your local variable "acceleration"
        double acceleration = in.nextDouble();
        System.out.println();

        System.out.print("Enter an elapsed time, in whole seconds: ");
        // DONE read and store the time provided by the user
        // Name your local variable "time"
        int time = in.nextInt();
        System.out.println();

        in.close();

        // DONE: Uncomment when ready
        System.out.println("Given:");
        System.out.printf("Velocity     = %.3f%n", velocity);
        System.out.printf("Acceleration = %.3f%n", acceleration);
        System.out.printf("Elapsed time = %d%n", time);
        System.out.println();

        double distance = calcDeltaPosition(velocity, acceleration, time);
        System.out.printf("Distance     = %.3f meters%n", distance);
        System.out.println();
        System.out.println(goodbyeMessage);
    }

    /**
     * Computes the standard 1D kinematics change in position.
     *
     * @param velocity - in meters per second
     * @param acceleration - in meters per second squared
     * @param time - elapsed time, in time
     * @return distance traveled, in meters
     */
    private static double calcDeltaPosition(double velocity, double acceleration, int time) {
        return velocity * time + 0.5 * acceleration * time * time;
    }

}
