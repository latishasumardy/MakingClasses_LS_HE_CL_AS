package com.example.latisha.makingclasses;

/**
 * Created by Latisha on 11/29/17.
 */

public class Arithmetic {
    // Step 6 implemented in lines 9-15 below
    public int mOperand1;
    public int mOperand2;

    public Arithmetic() {
        mOperand1 = 10;
        mOperand2 = 2;
    }
    // Step 17 implemented in lines 17-20 below
    public Arithmetic(int operand1, int operand2) {
        mOperand1 = operand1;
        mOperand2 = operand2;
    }
    
    //Step 26 implemented in lines 23-25 below
    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }

    //Step 29 implemented in lines 28-36 below
    public static int subtract(int operand1, int operand2){
        return operand1 - operand2;
    }
    public static int multiply(int operand1, int operand2){
        return operand1 * operand2;
    }
    public static int divide(int operand1, int operand2){
        return operand1 / operand2;
    }
    
    // Step 7 implemented in lines 17-19 below
    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }
    // Step 9 implemented in lines 21 below
    public int add() {
        return mOperand1 + mOperand2;
    }
    // Step 10 implemented in lines 25-33 below
    public int subtract() {
        return mOperand1 - mOperand2;
    }
    public int divide() {
        return mOperand1 / mOperand2;
    }
    public int multiply() {
        return mOperand1 * mOperand2;
    }
}

