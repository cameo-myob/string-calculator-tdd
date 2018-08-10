package com.company;
import java.util.ArrayList;

public class Calculator {
    public static int add(String input) throws IllegalArgumentException {
        String[] values = input.split(",|\\n");
        ArrayList<String[]> numbers = new ArrayList<>();
        if(values[0].contains("//"))
        {
            String[] allDelimiters = values[0].split("//|\\n");
            String[] splitDelimiters = allDelimiters[1]
                    .split("]\\[");
            String regex = "";
            for (int i = 0; i < splitDelimiters.length; i++)
            {
                regex += splitDelimiters[i] + "|";
            }
            numbers.add(values[1].split("([" + regex + "])+"));
        } else
        {
            numbers.add(values);
        }

        int sum = 0;
        for (int i = 0; i < numbers.get(0).length; i++)
            if(Integer.parseInt(numbers.get(0)[i]) < 0)
            {
                throw new IllegalArgumentException("Negatives not allowed: " + numbers.get(0)[i]);
            }
            else if (Integer.parseInt(numbers.get(0)[i]) >= 1000)
            {
                continue;
            } else
            sum += Integer.parseInt(numbers.get(0)[i]);
        return sum;
    }
}
