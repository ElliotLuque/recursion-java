package numeric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DigitsCountTest {

    @Test
    void itShouldGiveCorrectCount1Digit() {
        int number = 9;

        int result = DigitsCount.digitsCount(number);

        assertEquals(1, result);
    }

    @Test
    void itShouldGiveCorrectCount() {
        int number = 863710;

        int result = DigitsCount.digitsCount(number);

        assertEquals(6, result);
    }

    @Test
    void itShouldGiveIncorrectCount() {
        int number = 639;

        int result = DigitsCount.digitsCount(number);

        assertNotEquals(4, result);
    }

}
