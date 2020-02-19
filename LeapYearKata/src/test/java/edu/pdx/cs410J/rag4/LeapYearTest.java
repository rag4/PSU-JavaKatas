package edu.pdx.cs410J.rag4;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the LeapYear class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapYearTest
{
    /**
     * creates a new Leap Year object
     * @param year
     * @return
     */
    private LeapYear createLeapYear(int year){
        return new LeapYear(year);
    }

    /**
     * determines if year that is divisible by 400 is Leap Year
     * year is positive
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isPositiveNumberDivisibleBy400LeapYear(){
        int year = 2000;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(1));
    }

    /**
     * determines if year that is divisible by 100 but not 400 is Leap Year
     * year is positive
     * expected: IT IS NOT A LEAP YEAR
     */
    @Test
    public void isPositiveNumberDivisibleBy100ButNot400NotLeapYear(){
        int year = 1700;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(0));
    }

    /**
     * determines if year that is divisible by 4 but not 100 is Leap Year
     * year is positive
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isPositiveNumberDivisibleBy4ButNot100LeapYear(){
        int year = 2008;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(1));
    }

    /**
     * determines if year that is not divisible by 4 is Leap Year
     * year is positive
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isPositiveNumberNotDivisibleBy4NotLeapYear(){
        int year = 2019;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(0));
    }

    /**
     * determines if year that is divisible by 400 is Leap Year
     * year is negative
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isNegativeNumberDivisibleBy400LeapYear(){
        int year = -2000;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(1));
    }

    /**
     * determines if year that is divisible by 100 but not 400 is Leap Year
     * year is negative
     * expected: IT IS NOT A LEAP YEAR
     */
    @Test
    public void isNegativeNumberDivisibleBy100ButNot400NotLeapYear(){
        int year = -1700;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(0));
    }

    /**
     * determines if year that is divisible by 4 but not 100 is Leap Year
     * year is negative
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isNegativeNumberDivisibleBy4ButNot100LeapYear(){
        int year = -2008;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(1));
    }

    /**
     * determines if year that is not divisible by 4 is Leap Year
     * year is negative
     * expected: IT IS A LEAP YEAR
     */
    @Test
    public void isNegativeNumberNotDivisibleBy4NotLeapYear(){
        int year = -2019;
        LeapYear sample = createLeapYear(year);
        sample.determineLeapYear();
        assertThat(sample.getIsLeapYear(), equalTo(0));
    }

    /**
     * determines if year that is 0 is Leap Year
     * year is un-divisible
     * expected: ILLEGAL ARGUMENT EXCEPTION THROWN
     */
    @Test(expected = IllegalArgumentException.class)
    public void isYearZeroLeapYear(){
        int year = 0;
        LeapYear sample = createLeapYear(year);
    }
    
    

}
