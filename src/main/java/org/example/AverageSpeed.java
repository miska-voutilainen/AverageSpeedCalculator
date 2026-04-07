package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Console application for calculating average speed.
 */
public final class AverageSpeed {

    /**
     * Logger for this class.
     */
    private static final Logger LOGGER =
            Logger.getLogger(AverageSpeed.class.getName());

    private AverageSpeed() {
        // Prevent instantiation for utility class pattern.
    }

    /**
     * Application entry point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        LOGGER.info("Enter distance: ");
        double distance = input.nextDouble();

        LOGGER.info("Enter time: ");
        double time = input.nextDouble();

        double speed = averageSpeed(distance, time);
        LOGGER.log(Level.INFO, "Average speed: {0}", speed);

        input.close();
    }

    /**
     * Calculates average speed based on distance and time.
     *
     * @param distance traveled distance
     * @param time elapsed time
     * @return average speed
     */
    public static double averageSpeed(
            final double distance,
            final double time) {
        return distance / time;
    }
}
