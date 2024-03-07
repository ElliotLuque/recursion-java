package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubstringTest {
    @Test
    void itShouldBeSubstringBetween() {
        String a = "subs";
        String b = "zzzsubstringo";

        boolean result = IsSubstring.isSubstring(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldBeSubstringStarting() {
        String a = "rec";
        String b = "recursion";

        boolean result = IsSubstring.isSubstring(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldBeSubstringEnding() {
        String a = "sion";
        String b = "recursion";

        boolean result = IsSubstring.isSubstring(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldBeSubstringEquals() {
        String a = "substring";
        String b = "substring";

        boolean result = IsSubstring.isSubstring(a, b);

        assertTrue(result);
    }

    @Test
    void itShouldNotBeSubstring() {
        String a = "hello";
        String b = "substring";

        boolean result = IsSubstring.isSubstring(a, b);

        assertFalse(result);
    }
}
