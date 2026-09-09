import org.dmitryyarygin.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(4, 2), "4 * 2 should equal 8");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.division(100, 10), "100 / 10 should equal 10");
    }

    @Test
    void testDevisinByZero() {
        Calculator calculator =  new Calculator();
        assertThrows(ArithmeticException.class,
                () -> calculator.division(5, 0),
                "Zero division is not available");
    }

}
