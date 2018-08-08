package com.company;

public class Calculator {
    public static int add(String input) {
        String[] values = input.split(",|\\n");
        if(values[0].contains("//"))
        {
            String[] delimiter = values[0].split("//|\\n");
            values = values[1].split("["+ delimiter[1] + "]");
        }



        int sum = 0;
        for (int i = 0; i < values.length; i++)
            sum += Integer.parseInt(values[i]);
        return sum;
    }
}
