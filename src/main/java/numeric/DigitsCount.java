package numeric;

public class DigitsCount {

    /**
     * Returns the count of the digits from a given number
     * @param number The number
     * @return The count of the digits
     */
    public static int digitsCount(int number) {
        if (number < 10) {
            return 1;
        }

        return 1 + digitsCount(number / 10);
    }
}
