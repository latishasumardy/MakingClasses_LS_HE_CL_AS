package com.example.latisha.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Step 8 implemented in lines 13-15 below
        Arithmetic testArithmetic = new Arithmetic();

        System.out.println(testArithmetic);
        Arithmetic testTaxArithmetic = new TaxArithmetic();
        double test = testTaxArithmetic.calculateTax(10.75, 8.5);
        System.out.println(test);
    }
}
