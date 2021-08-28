package org.stringcalculator;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringCalculatorTest {

    @Test
    public void add_given_empty_string_should_return_zero() throws Exception {
        assertThat(add(""), is(0));
        assertThat(add("   "), is(0));
    }
    @Test
    public void add_given_one_number_should_return_the_number() throws Exception {
        assertThat(add("1"), is(1));
        assertThat(add("2"), is(2));
        assertThat(add(" 3 "), is(3));
    }

    private int add(final String input){
        return StringCalculator.add(input);
    }

}