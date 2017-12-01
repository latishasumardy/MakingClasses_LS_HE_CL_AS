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
       
        //Step 23 implemented in lines 17-19 below

        Arithmetic testTaxArithmetic = new TaxArithmetic();
        //double test = TaxArithmetic.calculateTax(10.75, 8.5);
        double add = TaxArithmetic.add(12, 13);
        //System.out.println(test);
    }
}
