import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 1, y = 2;

        int expected = 3;
        //When
        int actual = calculator.add(x, y);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 1, y = 2;

        int expected = -1;
        //When
        int actual = calculator.subtract(x, y);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 2, y = 2;

        int expected = 4;
        //When
        int actual = calculator.multiply(x, y);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 4, y = 2;

        int expected = 2;
        //When
        int actual = calculator.divide(x, y);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void exponentsTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 2, y = 2;

        int expected = 4;
        //When
        int actual = calculator.exponents(x, y);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void squareTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 2;

        int expected = 4;
        //When
        int actual = calculator.square(x);
        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void squareRootTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 4;

        int expected = 2;
        //When
        int actual = calculator.squareRoot(x);
        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void sineTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 1;

        double expected = 0.84;
        //When
        double actual = calculator.sine(x);
        //Then
        assertEquals(expected, actual,1e-15);
    }
}