package com.grocer.service;

import com.grocer.model.Receipt;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grocer.ReceiptRequest;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReceiptService {

    Register register;

    public Receipt buildReceipt(ReceiptRequest request) {
        return Receipt.builder()
                .products(request.getProducts())
                .cashier(request.getCashier())
                .subTotal(register.calculateSubTotal(request.getProducts()))
                .total(register.getTotal(request.getProducts()))
                .build();
    }
}
