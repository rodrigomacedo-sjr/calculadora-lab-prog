package com.calculator.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @PostMapping("/calculator")
    public String greeting(
        @RequestParam(name="numberA", required=true, defaultValue="0") String numberA,
        @RequestParam(name="numberB", required=true, defaultValue="0") String numberB,
        @RequestParam(name="operator", required=true, defaultValue="sum") String operator,
        Model model
    ) {
        Double doubleA = Double.valueOf(numberA);
        Double doubleB = Double.valueOf(numberB);
        Double result = switch (operator) {
            case "sum" -> doubleA + doubleB;
            case "sub" -> doubleA - doubleB;
            case "mult" -> doubleA * doubleB;
            case "div" -> doubleA / doubleB;
            default -> doubleA + doubleB;
        };
        model.addAttribute("result", result);
        return "calculator";
    }

}