package com.example.latisha.makingclasses;

/**
 * Created by Latisha on 11/30/17.
 */
// Step 20 implemented in line 7 below
public class TaxArithmetic extends Arithmetic {
    // Step 22 implemented in lines 9-13 below
    public static double calculateTax(double purchase, double rate){
        double tax = 0.0;
        tax = purchase * rate * .01;
        return tax;
    }
}
