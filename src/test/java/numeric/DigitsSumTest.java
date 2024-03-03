package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DigitsSumTest {

    @Test
    void itShouldGiveCorrectSum1Digit() {
        int number = 9;

        int result = DigitsSum.digitsSum(number);

        assertEquals(9, result);
    }

    @Test
    void itShouldGiveCorrectSum2Digit() {
        int number = 42;

        int result = DigitsSum.digitsSum(number);

        assertEquals(6, result);
    }

    @Test
    void itShouldGiveCorrectSum3Digit() {
        int number = 312;

        int result = DigitsSum.digitsSum(number);

        assertEquals(6, result);
    }

    @Test
    void itShouldGiveCorrectSum5Digit() {
        int number = 12345;

        int result = DigitsSum.digitsSum(number);

        assertEquals(15, result);
    }

    @Test
    void itShouldGiveIncorrectSum() {
        int number = 333;

        int result = DigitsSum.digitsSum(number);

        assertNotEquals(10, result);
    }
}
