package string;

public class IsPrefix {
    /**
     * Returns true if a is a prefix of b
     * @param a The a string
     * @param b The b string
     * @return True if a is a prefix of b, false otherwise
     */
    public static boolean isPrefix(String a, String b) {
        if (a.isEmpty()) {
            return true;
        }

        if (a.charAt(0) != b.charAt(0)) {
            return false;
        }

        return isPrefix(a.substring(1), b.substring(1));
    }
}
