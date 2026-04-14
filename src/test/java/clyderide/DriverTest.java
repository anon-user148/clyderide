package clyderide;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DriverTest {

    @Test
    void testYoungDriverExperience() {
        Driver driver = new Driver("John", 20, 0);
        double score = driver.experienceScore();

        assertEquals(0.6, score);
    }

    @Test
    void testDriverWithComplaints() {
        Driver driver = new Driver("Mary", 30, 2);
        double score = driver.experienceScore();

        assertEquals(0.6, score);
    }

    @Test
    void testMinimumScoreNotNegative() {
        Driver driver = new Driver("Bob", 30, 10);
        double score = driver.experienceScore();

        assertEquals(0.0, score);
    }
}