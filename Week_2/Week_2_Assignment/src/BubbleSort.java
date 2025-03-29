public class BubbleSort {

    /**
     * Sorts the given array of integers into ascending order using the Bubble Sort algorithm.
     *
     * @param array the array of integers to be sorted; must not be null
     *
     * <p>Example usage:
     * <pre>{@code
     * int[] numbers = {4, 2, 9, 1, 5};
     * BubbleSort.bubbleSort(numbers);
     * // Output after sorting: {1, 2, 4, 5, 9}
     * }</pre>
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
