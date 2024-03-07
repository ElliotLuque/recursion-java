package string;

public class IsSubstring {
    /**
     * Returns true if b is a substring of a
     * @param a The string to check if contains the substring
     * @param b The substring
     * @return True if b is a substring of a, false otherwise
     * */
    public static boolean isSubstring(String a, String b) {
        if (a.isEmpty()) {
            return true;
        }

        if (a.length() > b.length()) {
            return false;
        }

        return IsPrefix.isPrefix(a, b) || isSubstring(a, b.substring(1));
    }
}
