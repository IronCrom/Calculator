package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class IntsCalculatorTest {

        Ints calc = new IntsCalculator();

    @Test
    public void sum() {
        Assertions.assertEquals(calc.sum(333,222), 555);
    }

    @Test
    void mult() {
        Assertions.assertEquals(calc.mult(25,5), 125);
    }

    @Test
    void pow() {
        Assertions.assertEquals(calc.pow(15,2), 225);
    }
}