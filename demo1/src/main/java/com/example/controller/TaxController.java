package com.example.controller;

import com.example.model.TaxCalculationRequest;
import com.example.model.TaxCalculationResult;
import com.example.service.TaxCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tax")
public class TaxController {

    @Autowired
    private TaxCalculationService taxCalculationService;

    @PostMapping("/calculate")
    public ResponseEntity<TaxCalculationResult> calculateTax(@RequestBody TaxCalculationRequest request) {
        TaxCalculationResult result = taxCalculationService.calculate(request);
        return ResponseEntity.ok(result);
    }
}
