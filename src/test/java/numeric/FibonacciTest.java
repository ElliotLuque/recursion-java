package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FibonacciTest {

    @Test
    void itShouldGiveNFibonacci() {
        int value = 0;

        int result = Fibonacci.fibonacci(value);

        assertEquals(0, result);
    }

    @Test
    void itShouldGiveNegativeNFibonacci() {
        int value = -2;

        int result = Fibonacci.fibonacci(value);

        assertEquals(-2, result);
    }

    @Test
    void itShouldGiveCorrectFibonacciValue() {
        int value = 4;

        int result = Fibonacci.fibonacci(value);

        assertEquals(3, result);
    }

    @Test
    void itShouldGiveAnotherCorrectFibonacciValue() {
        int value = 8;

        int result = Fibonacci.fibonacci(value);

        assertEquals(21, result);
    }

    @Test
    void itShouldGiveIncorrectFibonacciValue() {
        int value = 4;

        int result = Fibonacci.fibonacci(value);

        assertNotEquals(4, result);
    }
}
