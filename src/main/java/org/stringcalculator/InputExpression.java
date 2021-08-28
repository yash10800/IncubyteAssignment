package org.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InputExpression {

    public static final List<String> DEFAULT_DELIMITERS = Arrays.asList(",", "\n");
    public static final String START_DELIMITERS_EXPRESSION = "//";
    public static final String END_DELIMITERS_EXPRESSION = "\n";

    private final String expression;

    public InputExpression(final String expression) {
        this.expression = expression;
    }

    public boolean isEmpty() {
        return "".equals(expression);
    }

    private NumbersExpression getNumberExpression() {
        return new NumbersExpression(expression);
    }

    public List<Integer> getNumbers() {
        return getNumberExpression().getNumbers(getDelimiters());
    }

    private List<String> getDelimiters() {
        final List<String> separators = new ArrayList<>();
        separators.addAll(DEFAULT_DELIMITERS);
        return separators;
    }
}
