package com.example.java.specificationpattern;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class SearchCriteriaBuilder {

    protected List<SearchCriteria> criteria = new ArrayList<>();

    public <T> T using(Class<T> classt) {
        try {
            Constructor<T> constructor = classt.getConstructor(SearchCriteriaBuilder.class);
            return constructor.newInstance(this);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public SearchCriteriaBuilder and(){
        return this;
    }

    public SearchCriteria build(){
        return new Criteria(criteria);
    }

}
