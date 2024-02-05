package com.example.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

   import static org.junit.jupiter.api.Assertions.assertEquals;

    public class YourTestClass {

        Manual expectedManual() {
            Manual manual = new Manual();
            manual.setSeats(7);
            manual.setTripComputer(true);
            manual.setGps(true);
            manual.setEngine("TDI");
            return manual;
        }

        Car expectedCar() {
            Car car = new Car();
            car.setSeats(5);
            car.setEngine("TDI");
            car.setTripComputer(true); // Correction ici
            car.setGps(true);
            return car;
        }

        @Test
        void makeSUVCar() {
            Director director = new Director();
            CarBuilder carBuilder = new CarBuilder();
            director.makeSUV(carBuilder);
            Car car = carBuilder.getResult();
            int expectedSeats = 5;

            assertEquals(expectedSeats, car.getSeats());
            assertEquals(expectedCar(), car);
        }

        @Test
        void getManualFromSportsCar() {
            Director director = new Director();
            CarManual carManual = new CarManual();
            director.makeSportsCar(carManual); // Correction ici
            Manual manual = carManual.getResult();
            int expectedSeats = 7;

            assertEquals(expectedSeats, manual.getSeats());
            assertEquals(expectedManual(), manual);
        }
    }

}
