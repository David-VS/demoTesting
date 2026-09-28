package be.ehb.demotesting.controller;

import be.ehb.demotesting.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private Calculator calculator;

    @Autowired
    public CalculatorController(Calculator mCalculator) {
        this.calculator = mCalculator;
    }


    /*
    * http://localhost:8080/sum?a=40&b=12

protocol -> http://
server -> localhost
port -> :8080
address -> /sum
eventueel parameters   -> ?x='value'
			&y='value'
*/
    @GetMapping("/sum")
    public int calculateSum(@RequestParam int a, @RequestParam  int b){
        return calculator.sum(a,b);
    }
}
