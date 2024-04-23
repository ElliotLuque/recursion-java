package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ElementCountTest {

    @Test
    void itShouldGiveCorrectCount() {
        int search = 4;
        int[] array = {1, 4, 2, 4, 4, 7, 4};
        int pos = 0;

        int result = ElementCount.elementCount(array, search, pos);

        assertEquals(4, result);
    }

    @Test
    void itShouldGiveCorrectCountNone() {
        int search = 45;
        int[] array = {1, 4, 2, 4, 4, 7, 9};
        int pos = 0;

        int result = ElementCount.elementCount(array, search, pos);

        assertEquals(0, result);
    }

    @Test
    void itShouldGiveCorrectSingleCount() {
        int search = 3;
        int[] array = {2, 5, 2, 3, 4, 8, 9};
        int pos = 0;

        int result = ElementCount.elementCount(array, search, pos);

        assertEquals(1, result);
    }

    @Test
    void itShouldGiveIncorrectCount() {
        int search = 6;
        int[] array = {6, 11, 2, 6, 4, 7, 25};
        int pos = 0;

        int result = ElementCount.elementCount(array, search, pos);

        assertNotEquals(1, result);
    }
}
