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

   @Test
   public void add_given_two_numbers_should_return_the_sum() throws Exception {
       assertThat(add("1,2"), is(3));
       assertThat(add("4,6"), is(10));
       assertThat(add("4, 12"), is(16));
       assertThat(add("100 , 100"), is(200));
   }

   @Test
   public void add_given_numbers_should_return_the_sum() throws Exception {
       assertThat(add("1,2,3"), is(6));
       assertThat(add("1,1,1,1"), is(4));
       assertThat(add("1 , 1 , 1 , 1 , 1"), is(5));
   }

    @Test
    public void add_given_numbers_separated_by_new_line_should_return_the_sum() throws Exception {
        assertThat(add("1\n2"), is(3));
        assertThat(add("1\n1\n1"), is(3));
    }

    private int add(final String input){
        return StringCalculator.add(input);
    }

}