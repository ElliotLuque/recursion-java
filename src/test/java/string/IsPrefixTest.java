package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPrefixTest {

    @Test
    void itShouldBePrefix() {
        String a = "hello";
        String b = "hello world";

        boolean result = IsPrefix.isPrefix(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldBePrefixEquals() {
        String a = "hello";
        String b = "hello";

        boolean result = IsPrefix.isPrefix(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldNotBePrefix() {
        String a = "hello";
        String b = "world hello";

        boolean result = IsPrefix.isPrefix(a, b);

        assertFalse(result);
    }
}
