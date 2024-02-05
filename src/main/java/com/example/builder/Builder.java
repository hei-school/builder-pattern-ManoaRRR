package com.example.builder;

public interface Builder {
    void setSeats(int number);
    void reset();
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGps(boolean gps);
    Object build();
}
