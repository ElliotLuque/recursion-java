package arrays;

public class MaxIndex {

    /**
     * Returns the index of the maximum integer in the array
     * @param array The array of integers
     * @param pos The initial pos for searching
     * @return The index of the maximum integer
     */
    public static int maxIndex(int[] array, int pos) {
        if (pos == array.length - 1) { return pos; }

        int maxIndex = maxIndex(array, pos + 1);

        if (array[pos] > array[maxIndex]) { return pos; }
        else { return maxIndex; }
    }
}
