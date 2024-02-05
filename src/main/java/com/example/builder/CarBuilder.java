package com.example.builder;

public class CarBuilder implements Builder {
    public Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void reset() {
        car = new Car(); // Si la méthode reset devrait réinitialiser la construction, recréez une nouvelle instance de Car.
    }

    @Override
    public void setSeats(int seatsNumber) {
        car.setSeats(seatsNumber);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer); // Correction du nom de la méthode
    }

    @Override
    public void setGps(boolean gps) {
        car.setGps(gps);
    }

    public Car getResult() {
        return this.car;
    }
}
