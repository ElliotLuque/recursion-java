package arrays;

public class ElementCount {
    /**
     * Returns how many times the 'search' integer appears on the array
     * @param array The array of integers
     * @param search The integer to search
     * @param pos The initial pos for searching
     * @return The count of the 'search' integer
     */
    public static int elementCount(int[] array, int search, int pos) {
        int count = 0;

        if (pos == array.length - 1) { return 0; }
        else if (array[pos] == search) { count++; }

        return count + elementCount(array, search, pos + 1);
    }
}
