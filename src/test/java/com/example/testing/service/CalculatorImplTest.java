package com.example.testing.service;

import com.example.testing.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static com.example.testing.service.Constanta.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorImplTest {

    private CalculatorImpl calculatorImpl = new CalculatorImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = calculatorImpl.addition(one, one);
        assertEquals(one + one, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = calculatorImpl.addition(two, one);
        assertEquals(two + one, result);
    }

    @Test
    public void shouldReturnOneWhenSubtractTwoAndOne() {
        int result = calculatorImpl.subtraction(two, one);
        assertEquals(two - one, result);
    }

    @Test
    public void shouldReturnThreeWhenSubtractFourAndOne() {
        int result = calculatorImpl.subtraction(four, one);
        assertEquals(four - one, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne() {
        int result = calculatorImpl.multiplication(one, two);
        assertEquals(one * two, result);
    }

    @Test
    public void shouldReturnFourWhenMultiplyTwoAndTwo() {
        int result = calculatorImpl.multiplication(two, two);
        assertEquals(two * two, result);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        int result = calculatorImpl.division(two, one);
        assertEquals(two / one, result);
    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        int result = calculatorImpl.division(one, one);
        assertEquals(one / one, result);
    }

    @Test
    public void souldThrowDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class, () -> calculatorImpl.division(one, zero));
    }
}