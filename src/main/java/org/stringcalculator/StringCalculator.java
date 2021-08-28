package org.stringcalculator;

public class StringCalculator {

    public static int add(final String input){
        final String nonSpacedString = input.replaceAll("\\s", "");
        final InputExpression inputExpression = new InputExpression(nonSpacedString);
        if (inputExpression.isEmpty()) {
            return 0;
        }
        return 0;
    }
}
