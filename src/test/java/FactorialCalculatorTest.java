import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void testGetFactorialForZero() {
        assertEquals(1, FactorialCalculator.getFactorial(0));
    }

    @Test
    public void testFactorialForPositiveNumber() {
        assertEquals(1, FactorialCalculator.getFactorial(1));
        assertEquals(2, FactorialCalculator.getFactorial(2));
        assertEquals(6, FactorialCalculator.getFactorial(3));
        assertEquals(24, FactorialCalculator.getFactorial(4));
        assertEquals(120, FactorialCalculator.getFactorial(5));
    }
}