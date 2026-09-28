package be.ehb.demotesting.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c;

    @BeforeEach
    public void init(){
        this.c = new Calculator();
    }

    @Test
    public void isSumCorrect(){
        assertEquals(4, c.sum(2,2));
        assertEquals(5, c.sum(3,2));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 13 ,11 , 23})
    public void isPrimeTrue(int input){
        assertTrue(c.isPrime(input));
    }



    /*
    @Test
    public void expectedResult(){
        assertEquals(HttpStatus.OK, );
    }
    */
}