package com.grocer.service;

import com.grocer.model.Product;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RegisterTest {
    @Test
    public void shouldCalculateSubtotal() {
        Register register = new Register();
        Product product1 = Product.builder()
                .price(2.00d)
                .build();
        Product product2 = Product.builder()
                .price(3.00d)
                .build();
        BigDecimal subTotal = register.calculateSubTotal(Arrays.asList(product1, product2));
        assertThat(subTotal).isEqualTo(new BigDecimal("5.00"));
    }

}