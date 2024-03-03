package numeric;

public class DigitsSum {
    /**
     * Returns the sum of the digits from a given number
     * @param number The number
     * @return The value of the sum
     */
    public static int digitsSum(int number) {
        if (number < 10) {
            return number;
        }

        return number % 10 + digitsSum(number / 10);
    }
}
