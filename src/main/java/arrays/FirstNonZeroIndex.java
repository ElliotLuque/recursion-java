package arrays;

public class FirstNonZeroIndex {
    /**
     * Returns the index of the first non-zero integer in the array
     * @param array The array of integers
     * @param pos The initial pos for searching
     * @return The index of the first non-zero integer
     */
    public static int firstNonZeroIndex(int[] array, int pos) {
        if (pos == array.length) { return -1; }
        else if (array[pos] != 0) { return pos; }
        else { return firstNonZeroIndex(array, pos + 1); }
    }
}
