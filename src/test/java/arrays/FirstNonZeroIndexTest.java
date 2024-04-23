package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FirstNonZeroIndexTest {
    @Test
    void itShouldGiveCorrectIndex() {
        int[] array = {0, 0, 2, 5};
        int pos = 0;

        int result = FirstNonZeroIndex.firstNonZeroIndex(array, pos);

        assertEquals(2, result);
    }

    @Test
    void itShouldGiveCorrectIndexNotFound() {
        int[] array = {0, 0, 0, 0};
        int pos = 0;

        int result = FirstNonZeroIndex.firstNonZeroIndex(array, pos);

        assertEquals(-1, result);
    }

    @Test
    void itShouldGiveIncorrectIndex() {
        int[] array = {2, 0, 1, 9};
        int pos = 0;

        int result = FirstNonZeroIndex.firstNonZeroIndex(array, pos);

        assertNotEquals(2, result);
    }
}
