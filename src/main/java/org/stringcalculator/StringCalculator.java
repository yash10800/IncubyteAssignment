package org.stringcalculator;

import java.util.List;

public class StringCalculator {

    public static int add(final String input){
        final String nonSpacedString = input.replaceAll("\\s", "");
        final InputExpression inputExpression = new InputExpression(nonSpacedString);
        if (inputExpression.isEmpty()) {
            return 0;
        }
        final List<Integer> numbers = inputExpression.getNumbers();
        return numbers.stream().filter(number -> number <= 1000).mapToInt(Integer::intValue).sum();
    }
}
