package com.example.java.specificationpattern;

public class PriceCriterion  implements SearchCriteria {

    private static final double DELTA = 0.001;

    private Operator operator;
    private double target;

    public PriceCriterion(Operator operator, double target){
        this.operator = operator;
        this.target = target;
    }

    public boolean isSatisfiedBy (Product product){
        boolean result = false;

        switch( operator) {
            case equal:
                result = Math.abs(product.getPrice() - target) <= DELTA;
                break;
            case lessThan:
                result = product.getPrice() < target;
                break;
            case largerThan:
                result = product.getPrice() > target;
                break;
        }

        return result;
    }

}
