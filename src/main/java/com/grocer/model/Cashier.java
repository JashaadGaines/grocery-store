package com.grocer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Cashier implements Serializable {
    @Id
    private Integer id;

    String firstName;
    String lastName;
}
