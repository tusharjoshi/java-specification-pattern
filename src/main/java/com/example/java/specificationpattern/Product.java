package com.example.java.specificationpattern;

public class Product {

    private double price;
    private int units;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean satisfies(SearchCriteria criteria){
        //Open up for extension
        return criteria.isSatisfiedBy(this);
    }

}
