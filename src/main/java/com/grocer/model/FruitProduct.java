package com.grocer.model;

import lombok.Data;

import java.util.Date;

public class FruitProduct extends Product {

    Date eatBy;

    @Override
    public double getTax() {
        return 0;
    }
}
