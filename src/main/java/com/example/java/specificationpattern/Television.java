package com.example.java.specificationpattern;

public class Television extends Product {
    private float screenSize;

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Television size:" + screenSize + " price:" + getPrice();
    }
}
