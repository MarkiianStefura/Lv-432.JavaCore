package com.company;

public class Car {
    private int yearOfProduction;
    private double engineCapacity;
    private CarType carType;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car(int yearOfProduction, double engineCapacity, CarType carType) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", carType=" + carType +
                '}';
    }
}
