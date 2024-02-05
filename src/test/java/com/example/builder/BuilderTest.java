package com.example.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YourTestClass {

    private static final int SUV_SEATS = 5;
    private static final int SPORTS_CAR_SEATS = 7;
    private static final String ENGINE_TYPE = "V8";

    private Car expectedCar() {
        Car car = new Car();
        car.setSeats(SUV_SEATS);
        car.setEngine(ENGINE_TYPE);
        car.setTripComputer(true);
        car.setGps(true);
        return car;
    }

    private Manual expectedManual() {
        Manual manual = new Manual();
        manual.setSeats(SPORTS_CAR_SEATS);
        manual.setTripComputer(true);
        manual.setGps(true);
        manual.setEngine(ENGINE_TYPE);
        return manual;
    }

    @Test
    void makeSUVCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        assertEquals(SUV_SEATS, car.getSeats());
        assertEquals(expectedCar(), car);
    }

    @Test
    void getManualFromSportsCar() {
        Director director = new Director();
        CarManual carManual = new CarManual();
        director.makeSportsCar(carManual);
        Manual manual = carManual.getResult();

        assertEquals(SPORTS_CAR_SEATS, manual.getSeats());
        assertEquals(expectedManual(), manual);
    }
}

