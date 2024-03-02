package numeric;

public class Fibonacci {
    /**
     * Returns the nth value of the fibonacci sequence
     * @param n The value of the sequence
     * @return The nth fibonacci value
     * */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
