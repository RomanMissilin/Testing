package com.example.testing.controller;

import com.example.testing.exception.DivisionByZeroException;
import com.example.testing.service.CalculatorImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/calculator")
@Controller
public class CalculatorController {

    private final CalculatorImpl calculatorImpl;

    public CalculatorController(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    @GetMapping
    public String welcome() {
        return calculatorImpl.welcome();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam int a,
                           @RequestParam int b) {
        return generateMessage(a, b, "+", calculatorImpl.addition(a, b));
    }

    @GetMapping("/plus")
    public String subtraction(@RequestParam int a,
                              @RequestParam int b) {
        return generateMessage(a, b, "+", calculatorImpl.subtraction(a, b));
    }

    @GetMapping("/plus")
    public String multiplication(@RequestParam int a,
                                 @RequestParam int b) {
        return generateMessage(a, b, "+", calculatorImpl.multiplication(a, b));
    }

    @GetMapping("/plus")
    public String division(@RequestParam int a,
                           @RequestParam int b) {
        return generateMessage(a, b, "+", calculatorImpl.division(a, b));
    }

    private String generateMessage(int a, int b, String operation, int result) {
        return String.format("%d %s %d = %d", a, operation, b, result);
    }
}