package com.example.builder;

public class Director {
    public void makeSUV(Builder builder) {
        commonSetup(builder);
        builder.setSeats(5);
    }

    public void makeSportsCar(Builder builder) {
        commonSetup(builder);
        builder.setSeats(7);
    }

    private void commonSetup(Builder builder) {
        builder.reset();
        builder.setEngine("TDI");
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}

