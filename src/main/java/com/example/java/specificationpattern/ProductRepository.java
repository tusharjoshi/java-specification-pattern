package com.example.java.specificationpattern;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static List<Television> televisionList = createTelevisionList();

    private static List<Television> createTelevisionList() {

        List<Television> list = new ArrayList<>();

        list.add(TelevisionBuilder.create().withPrice(3000).withScreenSize(13f).withUnits(1).build());
        list.add(TelevisionBuilder.create().withPrice(1000).withScreenSize(14f).withUnits(1).build());
        list.add(TelevisionBuilder.create().withPrice(2000).withScreenSize(12.2f).withUnits(1).build());
        list.add(TelevisionBuilder.create().withPrice(5000).withScreenSize(10f).withUnits(1).build());

        return list;
    }

    public static List<Television> getTelevisions() {
        return televisionList;
    }
}
