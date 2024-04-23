package arrays;

public class FirstNonZeroIndex {
    public static int firstNonZeroIndex(int[] array, int pos) {
        if (pos == array.length) { return -1; }
        else if (array[pos] != 0) { return pos; }
        else { return firstNonZeroIndex(array, pos + 1); }
    }
}
