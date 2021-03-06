package org.stringcalculator;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringCalculator {
	
	private static int NUMBER_OF_TIMES_ADD_CALLED = 0;

    public static int add(final String input) throws NegativeNumberNotSupportedException {
    	NUMBER_OF_TIMES_ADD_CALLED++;
    	final String nonSpacedString = input.replaceAll(" ", "");
        final InputExpression inputExpression = new InputExpression(nonSpacedString);
        if (inputExpression.isEmpty()) {
            return 0;
        }
        final List<Integer> numbers = inputExpression.getNumbers();
        if (numbers.stream().anyMatch(isNegative())) {
            throw NegativeNumberNotSupportedException.create(getNegativeFrom(numbers));
        }
        return numbers.stream().filter(number -> number <= 1000).mapToInt(Integer::intValue).sum();
    }

    private static List<Integer> getNegativeFrom(final List<Integer> numbers) {
        return numbers.stream().filter(isNegative()).collect(Collectors.toList());
    }
    
    public static int getCalledCount() {
    	return NUMBER_OF_TIMES_ADD_CALLED;
    }
    
    private static Predicate<Integer> isNegative() {
        return number -> number < 0;
    }

}
