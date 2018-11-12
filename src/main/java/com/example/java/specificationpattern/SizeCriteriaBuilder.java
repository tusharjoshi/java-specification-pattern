package com.example.java.specificationpattern;

public class SizeCriteriaBuilder {
    private final SearchCriteriaBuilder parentBuilder;
    Operator operator;
    float targetPrice;

    public SizeCriteriaBuilder(SearchCriteriaBuilder parentBuilder) {
        this.parentBuilder = parentBuilder;
    }

    public SizeCriteriaBuilder withScreenSize() {
        return this;
    }

    public SizeCriteriaBuilder being(Operator operator) {
        this.operator = operator;
        return this;
    }

    public SearchCriteriaBuilder value(float targetSize) {
        this.targetPrice = targetSize;
        parentBuilder.criteria.add(new SizeCriterion(operator,targetSize));
        return parentBuilder ;
    }
}
