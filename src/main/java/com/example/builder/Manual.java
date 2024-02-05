package com.example.builder;


import java.util.Objects;
import java.util.Objects;

public class Manual {
    private String type;
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public Manual(String type, int seats, String engine, boolean tripComputer, boolean gps) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manual manual = (Manual) o;
        return seats == manual.seats && tripComputer == manual.tripComputer && gps == manual.gps && Objects.equals(type, manual.type) && Objects.equals(engine, manual.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, tripComputer, gps);
    }

    @Override
    public String toString() {
        return String.format("Manual{type='%s', seats=%d, engine='%s', tripComputer=%b, gps=%b}",
                type, seats, engine, tripComputer, gps);
    }

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

    public boolean isTripCompute() {
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
}

