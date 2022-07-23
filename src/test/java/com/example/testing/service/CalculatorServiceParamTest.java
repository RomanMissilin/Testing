package com.example.testing.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.testing.service.Constanta.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParamTest {

    private final CalculatorImpl calculator = new CalculatorImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int a, int b) {
        int result = calculator.addition(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubtractionCorrectly(int a, int b) {
        int result = calculator.subtraction(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplicationCorrectly(int a, int b) {
        int result = calculator.multiplication(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivisionCorrectly(int a, int b) {
        int result = calculator.division(a, b);
        assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(four, one),
                Arguments.of(zero, two),
                Arguments.of(three, one),
                Arguments.of(two, four)
        );
    }
}