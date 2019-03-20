package com.grocer.model;

import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Builder(toBuilder = true)
@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Product implements Serializable, Orderable {
    private double price;
    private String name;
    private String description;

    @Override
    public double getTax() {
        return 0.5;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
