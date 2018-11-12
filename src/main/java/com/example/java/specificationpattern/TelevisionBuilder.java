package com.example.java.specificationpattern;

public class TelevisionBuilder {

    private float screenSize;
    private double price;
    private int units;

    public static TelevisionBuilder create() {
        return new TelevisionBuilder();
    }

    public TelevisionBuilder withScreenSize(float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public TelevisionBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public TelevisionBuilder withUnits(int units) {
        this.units = units;
        return this;
    }

    public Television build() {
        Television television = new Television();
        television.setScreenSize(screenSize);
        television.setPrice(price);
        television.setUnits(units);
        return television;
    }
}
