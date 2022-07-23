package com.example.testing.service;

import com.example.testing.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
