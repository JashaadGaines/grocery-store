package com.grocer.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class Cashier implements Serializable {
    String firstName;
    String lastName;
}
