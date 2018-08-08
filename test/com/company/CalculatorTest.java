package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // Test

//    First test - method takes string and returns number
    @Test
    void returnsNumber(){
        int test = 0;
        assertEquals(test, Calculator.add("0"));
    }

//    Second test - method takes string value and returns int value
    @Test
    void returnsIntValue(){
        int test2 = 2;
        int test3 = 3;
        int test10 = 10;

        assertEquals(test2, Calculator.add(Integer.toString(test2)));
        assertEquals(test3, Calculator.add(Integer.toString(test3)));
        assertEquals(test10, Calculator.add(Integer.toString(test10)));
    }

//    Third test - method takes two numbers in a string and returns the sum of the numbers
    @Test
    void returnsSum(){
        int sumFourFive = 9;
        int sumTenEight = 18;

        assertEquals(sumFourFive, Calculator.add("4,5"));
        assertEquals(sumTenEight, Calculator.add("10,8"));
    }

//    Fourth test - method takes any amount of numbers in string and returns the sum
    @Test
    void returnsSumOfAll(){
        int sumFourFiveSix = 15;
        int sumOneTwoThreeFour = 10;

        assertEquals(sumFourFiveSix, Calculator.add("4,5,6"));
        assertEquals(sumOneTwoThreeFour, Calculator.add("1,2,3,4"));
    }

//    Fifth test - new line breaks and commas should be interchangeable between numbers
    @Test
    void splitLinebreaksAndCommas(){
        int sumFourFiveSix = 15;
        int sumOneTwoThreeFour = 10;

        assertEquals(sumFourFiveSix, Calculator.add("4,5\n6"));
        assertEquals(sumOneTwoThreeFour, Calculator.add("1\n2,3\n4"));
    }

//    Sixth test - support different delimiters
    @Test
    void supportDifferentDelimiters(){
        int sumFourFiveSix = 15;
        int sumOneTwoThreeFour = 10;

        assertEquals(sumFourFiveSix, Calculator.add("//;\n4;5;6"));
        assertEquals(sumOneTwoThreeFour, Calculator.add("//?\n1?2?3?4"));
    }

//    Seventh test - calling add with a negative number will throw an exception "Negatives not allowed" and the negative number that was passed
    @Test
    void exceptionTesting(){
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.add("//;\n-4;5;6");
        });
    }

//    Eighth test - numbers greater than or equal to 1000 should be ignored
    @Test
    void ignore1000(){
        int two = 2;
        int sumFiveSix = 11;

        assertEquals(two, Calculator.add("1000,2,13483"));
        assertEquals(sumFiveSix, Calculator.add("5,6,1059832"));
    }
}