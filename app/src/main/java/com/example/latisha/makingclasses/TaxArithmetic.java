package com.example.latisha.makingclasses;

/**
 * Created by Latisha on 11/30/17.
 */
// Step 20 implemented in line 7 below
public class TaxArithmetic extends Arithmetic {
    // Step 22 implemented in lines 9-13 below
    /*
    public static double calculateTax(double purchase, double rate){
        double tax = 0.0;
        tax = purchase * rate * .01;
        return tax;
    }
    */
    //Steps 24-25 implemented below in lines 17-22
    public double calculateTax(double rate) {
        int purchase = mOperand1 + mOperand2;
        // follow with the rest of your algorithm
        double tax = 0.0;
        tax = purchase * rate * .01;
        return tax;
    }
}
