package com.example.java.specificationpattern;

import java.util.Iterator;
import java.util.List;

public class Criteria implements SearchCriteria, Iterable<SearchCriteria> {

    private List<SearchCriteria> criteria ;


    public Criteria(List<SearchCriteria> criteria){
        this.criteria = criteria;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        Iterator<SearchCriteria> iterator = criteria.iterator();
        while(iterator.hasNext()){
            if(!(iterator.next()).isSatisfiedBy(product))
                return false;
        }
        return true;
    }

    @Override
    public Iterator<SearchCriteria> iterator() {
        return criteria.iterator();
    }
}
