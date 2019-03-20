package com.grocer.model;

public class TabaccoProduct extends Product {

    int ageMin;

    @Override
    public double getTax() {
        return 0.8;
    }
}
