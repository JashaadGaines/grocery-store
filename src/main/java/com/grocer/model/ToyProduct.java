package com.grocer.model;

public class ToyProduct extends Product{

    @Override
    public double getTax() {
        return 0.5;
    }
}
