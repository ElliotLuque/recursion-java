package numeric;

public class NthPower {
   /**
    * Returns the value of the real number raised to n
    * @param number The base
    * @param n The exponent
    * @return The result of number^n
    * */
    public static double nthPower(double number, double n) {
        if (n == 0) {
            return 1;
        }

        return number * nthPower(number, n -1);
    }
}
