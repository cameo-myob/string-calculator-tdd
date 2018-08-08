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

//    Third test - method takes two numbers in a string and returns the sum of the numbers
    @Test
    public void returnsSum(){
        int sumFourFive = 9;
        int sumTenEight = 18;

        assertEquals(sumFourFive, Calculator.add("4,5"));
        assertEquals(sumTenEight, Calculator.add("10,8"));
    }

//    Fourth test - method takes any amount of numbers in string and returns the sum
    @Test
    public void returnsSumAll(){
        int sumFourFiveSix = 15;
        int sumOneTwoThreeFour = 10;

        assertEquals(sumFourFiveSix, Calculator.add("4,5,6"));
        assertEquals(sumOneTwoThreeFour, Calculator.add("1,2,3,4"));
    }
}