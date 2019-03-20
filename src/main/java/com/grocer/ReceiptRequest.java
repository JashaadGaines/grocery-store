package com.grocer;

import com.grocer.model.Cashier;
import com.grocer.model.Orderable;
import lombok.Data;

import java.util.List;

@Data

public class ReceiptRequest {
    List<Orderable> products;
    Cashier cashier;
}
