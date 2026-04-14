package clyderide;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testNoDriversExperienceIsZero() {
        Vehicle vehicle = new Vehicle("Toyota", "Yaris", 3, 2020);
        assertEquals(0.0, vehicle.driverExperience());
    }

    @Test
    void testVehicleClassOutOfRange() {
        Vehicle vehicle = new Vehicle("BMW", "X5", 15, 2022);
        assertEquals(100, vehicle.vehicleRating());
    }

    @Test
    void testAddDriverIncreasesCount() {
        Vehicle vehicle = new Vehicle("Ford", "Focus", 5, 2020);
        Driver d1 = new Driver("Alice", 30, 1);
        int count = vehicle.addDriver(d1);
        assertEquals(1, count);
    }

    @Test
    void testRemoveDriverByNameRemovesMatchingDriver() {
        Vehicle vehicle = new Vehicle("Audi", "A3", 4, 2021);
        Driver d1 = new Driver("Sam", 30, 0);
        vehicle.addDriver(d1);

        boolean removed = vehicle.removeDriverByName("Sam");

        assertTrue(removed);
        assertEquals(0.0, vehicle.driverExperience());
    }

    @Test
    void testRemoveDriverReturnsFalseIfNotFound() {
        Vehicle vehicle = new Vehicle("VW", "Golf", 5, 2020);

        Driver d1 = new Driver("Tom", 40, 0);
        vehicle.addDriver(d1);

        boolean removed = vehicle.removeDriverByName("NOT_EXIST");

        assertFalse(removed);
    }
}