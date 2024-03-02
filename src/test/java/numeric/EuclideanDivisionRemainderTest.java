package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EuclideanDivisionRemainderTest {

    @Test
    void itShouldGiveDividendRemainder() {
        int dividend = 31;
        int divisor = 55;

        int result = EuclideanDivisionRemainder.euclideanRemainder(dividend, divisor);

        assertEquals(31, result);
    }

    @Test
    void itShouldGiveCorrectRemainder() {
        int dividend = 320;
        int divisor = 21;

        int result = EuclideanDivisionRemainder.euclideanRemainder(dividend, divisor);

        assertEquals(5, result);
    }

    @Test
    void itShouldGiveIncorrectRemainder() {
        int dividend = 5;
        int divisor = 2;

        int result = EuclideanDivisionRemainder.euclideanRemainder(dividend, divisor);

        assertNotEquals(0, result);
    }
}
