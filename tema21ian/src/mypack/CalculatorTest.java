package mypack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    mypack.Calculator calculator = new mypack.Calculator();

    @Test
    public void divideOk() {
        Assertions.assertEquals(calculator.divide(6, 2), 3, 0);
    }

    @Test
    public void divideByZero() {
        Assertions.assertEquals(calculator.divide(6.0, 0.0), Double.POSITIVE_INFINITY, 0);
    }
}