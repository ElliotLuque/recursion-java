package string;

public class ReverseString {
    /**
     * Returns the reversed string
     * @param string The string to be reversed
     * @return The reversed string
     */
    public static String reverseString(String string) {
        if (string.isEmpty()) {
            return "";
        }

        return reverseString(string.substring(1)) + string.charAt(0);
    }
}
