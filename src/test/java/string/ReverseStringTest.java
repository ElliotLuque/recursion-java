package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ReverseStringTest {

    @Test
    void itShouldGiveReversedString() {
        String string = "holamundo";

        String result = ReverseString.reverseString(string);

        assertEquals("odnumaloh", result);
    }

    @Test
    void itShouldGiveEmptyString() {
        String string = "";

        String result = ReverseString.reverseString(string);

        assertEquals("", result);
    }

    @Test
    void itShouldGiveNotReversedString() {
        String string = "holamundo";

        String result = ReverseString.reverseString(string);

        assertNotEquals("holamundo", result);
    }
}
