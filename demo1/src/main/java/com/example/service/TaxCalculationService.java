package com.example.service;

import com.example.model.TaxCalculationRequest;
import com.example.model.TaxCalculationResult;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculationService {

    public TaxCalculationResult calculate(TaxCalculationRequest request) {
        TaxCalculationResult result = new TaxCalculationResult();
        double income = request.getIncome();
        double tax = 0;

        if (income <= 5000) {
            tax = 0;
        } else if (income <= 8000) {
            tax = (income - 5000) * 0.03;
        } else if (income <= 17000) {
            tax = (income - 8000) * 0.1 + 300; // 300 is the tax for the first bracket
        } else if (income <= 30000) {
            tax = (income - 17000) * 0.2 + 1700; // 1700 is the tax for the first two brackets
        } else {
            // 如果工资超过30000元，可以继续添加更多的税率区间
            // 这里只是一个示例，具体税率根据当地税法来定
        }

        result.setTaxAmount(tax);
        return result;
    }
}