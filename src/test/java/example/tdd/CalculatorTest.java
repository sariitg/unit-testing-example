package example.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testDivide_wholeNumber() {
        assertEquals(1, calculator.divide(2, 2));
    }

    @Test
    public void testDivide_decimal() {
        assertEquals(4, calculator.divide(10, 2.5));
    }

    @Test
    public void testDivide_byZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(102, 0);
        });
    }
}
