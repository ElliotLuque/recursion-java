package arrays;

public class ElementSum {
    /**
     * Returns the sum of the elements of the array in descending order
     * @param array The array of numbers
     * @param pos The initial position
     * @return The value of the sum
     */
    public static int elementSumDesc(int[] array, int pos) {
        if (pos == -1) {
            return 0;
        }

        return array[pos] + elementSumDesc(array, pos - 1);
    }

    /**
     * Returns the sum of the elements of the array in ascending order
     * @param array The array of numbers
     * @param pos The initial position
     * @return The value of the sum
     */
    public static int elementSumAsc(int[] array, int pos) {
        if (pos == array.length) {
            return 0;
        }

        return array[pos] + elementSumAsc(array, pos + 1);
    }
}