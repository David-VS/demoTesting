package be.ehb.demotesting.utils;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
