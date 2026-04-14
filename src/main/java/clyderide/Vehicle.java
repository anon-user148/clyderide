package clyderide;

import java.util.ArrayList;

public class Vehicle {
    private String make;
    private String model;
    private int vehicleClass;
    private int year;
    private ArrayList<Driver> drivers;

    public Vehicle(String make, String model, int vehicleClass, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        if (vehicleClass < 1 || vehicleClass > 10) {
            this.vehicleClass = 100;
        } else {
            this.vehicleClass = vehicleClass;
        }

        this.drivers = new ArrayList<>();
    }

    public int addDriver(Driver driver) {
        drivers.add(driver);
        return drivers.size();
    }

    public boolean removeDriverByName(String name) {
        boolean removed = false;

        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).getName().equals(name)) {
                drivers.remove(i);
                removed = true;
                i--;
            }
        }

        return removed;
    }

    public double driverExperience() {
        if (drivers.isEmpty()) {
            return 0.0;
        }

        double max = 0.0;

        for (Driver d : drivers) {
            if (d.experienceScore() > max) {
                max = d.experienceScore();
            }
        }

        return max;
    }

    public int vehicleRating() {
        return vehicleClass;
    }
}