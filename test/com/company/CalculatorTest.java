package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // Test

//    First test - method takes string and returns number
    @Test
    public void returnsNumber(){
        int test = 0;
        assertEquals(test, Calculator.add("0"));
    }

}