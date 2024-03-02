package numeric;

public class EuclideanDivisionRemainder {
    /**
     * Returns the remainder of dividend/divisor
     * @param dividend The number being divided
     * @param divisor The number which the dividend is divided
     * @return The remainder of the operation
     * */
    public static int euclideanRemainder(int dividend, int divisor) {
        if (dividend < divisor) {
            return dividend;
        }

        return euclideanRemainder(dividend - divisor, divisor);
    }
}
