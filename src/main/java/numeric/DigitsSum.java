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

/*
42

42%10 = 2
42/10 = 4
2/10 = *2*

6
*/


/*
312

312 / 10 = 31
312 % 10 = .2.

31 / 10 = 3
31 % 10 = .1.

3 % 10 = .3.

6
 */