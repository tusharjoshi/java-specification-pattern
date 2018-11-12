package com.example.java.specificationpattern;

public class PriceCriteriaBuilder {
    Operator operator;
    double targetPrice;
    private SearchCriteriaBuilder parentBuilder;

    public PriceCriteriaBuilder(SearchCriteriaBuilder parentBuilder) {
        this.parentBuilder = parentBuilder;
    }

    public PriceCriteriaBuilder withPrice() {
        return this;
    }

    public PriceCriteriaBuilder being(Operator operator) {
        this.operator = operator;
        return this;
    }

    public SearchCriteriaBuilder value(double targetPrice) {
        this.targetPrice = targetPrice;
        parentBuilder.criteria.add(new PriceCriterion(operator,targetPrice));
        return parentBuilder ;
    }
}
