package com.grocer.service;

import com.grocer.model.Orderable;

import java.math.BigDecimal;
import java.util.List;

public class Register {

    public double getTax(Orderable product){
        return product.getTax();
    }

    public BigDecimal calculateSubTotal(List<Orderable> products){
        return BigDecimal.valueOf(products.stream()
                .mapToDouble(Orderable::getPrice)
                .sum()).setScale(2,BigDecimal.ROUND_CEILING);
    }

    public BigDecimal calculateSalesTax(List<Orderable> products){
            return BigDecimal.valueOf(products.stream()
                    .mapToDouble(Orderable::getTax)
                    .sum()).setScale(2, BigDecimal.ROUND_CEILING);
    }

    public BigDecimal getTotal(List<Orderable> products){
         return calculateSubTotal(products).add(calculateSalesTax(products));
    }

}
