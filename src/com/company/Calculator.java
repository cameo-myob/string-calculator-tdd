package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    public static int add(String input) throws IllegalArgumentException {
        String[] values = input.split(",|\\n");
        ArrayList<String> numbers = new ArrayList<>();
        if(values[0].contains("//"))
        {
            String[] allDelimiters = values[0].split("//|\\n");
            String[] splitDelimiters = allDelimiters[1].split("]\\[");
            String regex = String.join("|", splitDelimiters);
            numbers.addAll(Arrays.asList(values[1].split("([" + regex + "])+")));
        } else
        {
            numbers.addAll(Arrays.asList(values));
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
            if(Integer.parseInt(numbers.get(i)) < 0)
            {
                throw new IllegalArgumentException("Negatives not allowed: " + numbers.get(i));
            }
            else if (Integer.parseInt(numbers.get(i)) >= 1000)
            {
                continue;
            } else
                sum += Integer.parseInt(numbers.get(i));
        return sum;
    }
}