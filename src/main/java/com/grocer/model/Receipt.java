package com.grocer.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Receipt {

    private Integer id;
    private BigDecimal total;
    private BigDecimal subTotal;
    private BigDecimal tax;
    private Cashier cashier;
    private List<Orderable> products;

}
