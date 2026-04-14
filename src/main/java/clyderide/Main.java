package clyderide;

public class Main {

    public static void main(String[] args) {

        Driver d1 = new Driver("Alice", 20, 0);
        Driver d2 = new Driver("Bob", 30, 2);
        Driver d3 = new Driver("Charlie", 80, 1);

        Vehicle v1 = new Vehicle("Toyota", "Yaris", 3, 2020);
        v1.addDriver(d1);
        v1.addDriver(d2);

        Vehicle v2 = new Vehicle("BMW", "X5", 15, 2022);
        v2.addDriver(d3);

        RideQuote q1 = new RideQuote(v1, 10.0);
        RideQuote q2 = new RideQuote(v2, 10.0);

        System.out.println("Vehicle 1 rating: " + v1.vehicleRating());
        System.out.println("Vehicle 1 driver experience: " + v1.driverExperience());
        System.out.println("Vehicle 1 fare: " + q1.calculateFare());

        System.out.println("Vehicle 2 rating: " + v2.vehicleRating());
        System.out.println("Vehicle 2 driver experience: " + v2.driverExperience());
        System.out.println("Vehicle 2 fare: " + q2.calculateFare());
    }
}