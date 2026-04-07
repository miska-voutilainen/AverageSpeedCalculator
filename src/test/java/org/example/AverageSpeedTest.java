package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for AverageSpeed.
 */
class AverageSpeedTest {

    /**
     * Assertion tolerance for double comparisons.
     */
    private static final double DELTA = 0.0001;

    /**
     * Input distance for whole-number case.
     */
    private static final double WHOLE_DISTANCE = 120.0;

    /**
     * Input time for whole-number case.
     */
    private static final double WHOLE_TIME = 2.0;

    /**
     * Expected speed for whole-number case.
     */
    private static final double WHOLE_EXPECTED_SPEED = 60.0;

    /**
     * Input distance for fractional case.
     */
    private static final double FRACTIONAL_DISTANCE = 15.5;

    /**
     * Input time for fractional case.
     */
    private static final double FRACTIONAL_TIME = 2.0;

    /**
     * Expected speed for fractional case.
     */
    private static final double FRACTIONAL_EXPECTED_SPEED = 7.75;

    /**
     * Input distance for division-by-zero case.
     */
    private static final double ZERO_TIME_DISTANCE = 10.0;

    /**
     * Input time for division-by-zero case.
     */
    private static final double ZERO_TIME = 0.0;

    /**
     * Verifies average speed with whole numbers.
     */
    @Test
    void shouldCalculateAverageSpeed() {
        double result = AverageSpeed.averageSpeed(
                WHOLE_DISTANCE,
                WHOLE_TIME);
        assertEquals(WHOLE_EXPECTED_SPEED, result, DELTA);
    }

    /**
     * Verifies average speed with fractional values.
     */
    @Test
    void shouldCalculateAverageSpeedForFractions() {
        double result = AverageSpeed.averageSpeed(
                FRACTIONAL_DISTANCE,
                FRACTIONAL_TIME);
        assertEquals(FRACTIONAL_EXPECTED_SPEED, result, DELTA);
    }

    /**
     * Verifies behavior when dividing by zero with doubles.
     */
    @Test
    void shouldReturnInfinityWhenTimeIsZero() {
        double result = AverageSpeed.averageSpeed(
                ZERO_TIME_DISTANCE,
                ZERO_TIME);
        assertTrue(Double.isInfinite(result));
    }
}
