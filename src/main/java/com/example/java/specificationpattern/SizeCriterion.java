package com.example.java.specificationpattern;

public class SizeCriterion implements SearchCriteria {

    private static final float DELTA = 0.001f;

    private Operator operator;
    private float target;

    public SizeCriterion(Operator operator, float target){
        this.operator = operator;
        this.target = target;
    }

    public boolean isSatisfiedBy (Product product){
        boolean result = false;
        Television television = (Television) product;

        switch( operator) {
            case equal:
                result = Math.abs(television.getScreenSize() - target) <= DELTA;
                break;
            case lessThan:
                result = television.getScreenSize() < target;
                break;
            case largerThan:
                result = television.getScreenSize() > target;
                break;
        }

        return result;
    }

}
