package com.grocer;

import com.grocer.model.Receipt;
import com.grocer.service.ReceiptService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(path = "/receipt")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ReceiptController {

    private ReceiptService recieptService;

    @PostMapping(path = "/batches")
    @ResponseStatus(CREATED)
    @ApiOperation(value = "build receipt", notes = "Build a Receipt from list of products")
    public Receipt create(@RequestBody ReceiptRequest request)  {
        return recieptService.buildReceipt(request);
    }
}
