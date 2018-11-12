package com.example.java.specificationpattern;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.java.specificationpattern.Operator.largerThan;
import static com.example.java.specificationpattern.Operator.lessThan;

public class Main {
    public static void main(String... args) {


        SearchCriteria criteria = new SearchCriteriaBuilder()
                .using(PriceCriteriaBuilder.class).withPrice().being(lessThan).value(3000)
                .and()
                .using(SizeCriteriaBuilder.class).withScreenSize().being(largerThan).value(12.1f)
                .build();

        List<Television> televisionList = ProductRepository.getTelevisions()
                .stream()
                .filter(t -> t.satisfies(criteria))
                .collect(Collectors.toList());

        for( Television television : televisionList) {
            System.out.println(television);
        }
    }
}