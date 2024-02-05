[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)

# Car Builder Project

This project demonstrates the use of a builder pattern to construct different types of cars and manuals.

## Overview

The project consists of the following components:

- `Car`: Represents a car with various properties such as seats, engine type, trip computer, and GPS.
- `Manual`: Represents a manual for a car with similar properties.

- `Builder` Interface: Defines the methods for building different components of a car or manual.
  
- `CarBuilder` and `CarManual` classes: Implement the `Builder` interface to construct instances of `Car` and `Manual` respectively.

- `Director` class: Orchestrates the construction of different types of cars using the builder pattern.

- `YourTestClass` class: Contains JUnit tests for the functionality of the builder pattern.

## Usage

To use the builder pattern to create different types of cars and manuals, follow these steps:

1. **Create a CarBuilder or CarManual instance:**

    ```java
    CarBuilder carBuilder = new CarBuilder();
    CarManual carManual = new CarManual();
    ```

2. **Use the Director to construct a specific type of car or manual:**

    ```java
    Director director = new Director();
    director.makeSUV(carBuilder);
    director.makeSportsCar(carManual);
    ```

3. **Retrieve the constructed object:**

    ```java
    Car suvCar = carBuilder.getResult();
    Manual sportsCarManual = carManual.getResult();
    ```

4. **Use the constructed objects as needed.**

## Running Tests

To run the tests, execute the following command:

```bash
./gradlew test

