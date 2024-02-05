package com.example.builder;

import java.util.Objects;

import java.util.Objects;

public class Car {
    private String type;
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return String.format("Car{type='%s', seats=%d, engine='%s', tripComputer=%b, gps=%b}",
                type, seats, engine, tripComputer, gps);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && tripComputer == car.tripComputer && gps == car.gps &&
                Objects.equals(type, car.type) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, tripComputer, gps);
    }
}

