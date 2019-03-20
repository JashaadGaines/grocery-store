package com.grocer.model;

import lombok.Data;

import java.util.Date;

@Data
public class FruitProduct extends Product {

    Date eatBy;

    @Override
    public double getTax() {
        return 0;
    }
}
