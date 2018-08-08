package com.company;

public class Calculator {
    public static int add(String input) {
        String[] values = input.split(",|\\n");
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += Integer.parseInt(values[i]);
        }
        return sum;
    }
}
