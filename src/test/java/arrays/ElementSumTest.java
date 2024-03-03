package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ElementSumTest {

    @Test
    void itShouldGiveCorrectElementSumDescSingleElement() {
        int[] array = {7};

        int result = ElementSum.elementSumDesc(array, array.length - 1);

        assertEquals(7, result);
    }

    @Test
    void itShouldGiveCorrectElementSumDesc() {
        int[] array = {2, 4, 6, 8};

        int result = ElementSum.elementSumDesc(array, array.length - 1);

        assertEquals(20, result);
    }

    @Test
    void itShouldGiveCorrectDescElementSumBigger() {
        int[] array = {24162, 4094, 609, 852};

        int result = ElementSum.elementSumDesc(array, array.length - 1);

        assertEquals(29717, result);
    }

    @Test
    void itShouldGiveCorrectAscElementSumBigger() {
        int[] array = {12518, 52851, 9935, 124, 623, 78};

        int result = ElementSum.elementSumAsc(array, 0);

        assertEquals(76129, result);
    }

    @Test
    void itShouldGiveIncorrectElementSumDesc() {
        int[] array = {4, 6};

        int result = ElementSum.elementSumDesc(array, array.length - 1);

        assertNotEquals(11, result);
    }

    @Test
    void itShouldGiveIncorrectElementSumAsc() {
        int[] array = {7, 6, 1};

        int result = ElementSum.elementSumAsc(array, 0);

        assertNotEquals(17, result);
    }
}
