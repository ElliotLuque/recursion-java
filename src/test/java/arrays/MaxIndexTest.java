package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MaxIndexTest {
    @Test
    void itShouldGiveCorrectIndex() {
        int[] array = {0, 4, 67, 41, -12, 5, -52, 35};
        int pos = 0;

        int result = MaxIndex.maxIndex(array, pos);

        assertEquals(2, result);
    }

    @Test
    void itShouldGiveCorrectFirstIndex() {
        int[] array = {97, -16, 24, 51, -22, 15, 12, 45};
        int pos = 0;

        int result = MaxIndex.maxIndex(array, pos);

        assertEquals(0, result);
    }

    @Test
    void itShouldGiveCorrectLastIndex() {
        int[] array = {-2, 12, 28, 9, -5, 5, 0, 75};
        int pos = 0;

        int result = MaxIndex.maxIndex(array, pos);

        assertEquals(7, result);
    }

    @Test
    void itShouldGiveIncorrectIndex() {
        int[] array = {8, 1, 61, 8, -43, 7, 1, 2};
        int pos = 0;

        int result = MaxIndex.maxIndex(array, pos);

        assertNotEquals(0, result);
    }
}
