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

//    Second test - method takes string value and returns int value
    @Test
    public void returnsIntValue(){
        int test2 = 2;
        int test3 = 3;
        int test10 = 10;

        assertEquals(test2, Calculator.add(Integer.toString(test2)));
        assertEquals(test3, Calculator.add(Integer.toString(test3)));
        assertEquals(test10, Calculator.add(Integer.toString(test10)));
    }
}