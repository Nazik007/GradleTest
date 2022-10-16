package gradletest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach () {
        calculator = new SumCalculator();
    }

    @Test
    public void sumMethodIsValid () {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 1);
        numbers.put(3, 6);

        numbers.forEach((actual, expected) ->
                Assertions.assertEquals(
                        expected,
                        calculator.sum(actual)
                ));
    }

    @Test
    public void isIllegalArgumentExceptionThrown () {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.sum(0));
    }
}
