

package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface TaxCalculationService {
    @WebMethod
    double calculateTax(double income);
}