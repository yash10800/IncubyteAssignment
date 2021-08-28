package org.stringcalculator;

public class InputExpression {

    private final String expression;

    public InputExpression(final String expression) {
        this.expression = expression;
    }

    public boolean isEmpty() {
        return "".equals(expression);
    }
}
