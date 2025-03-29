public class Main {
    public static void main(String[] args) {
        int[] myArray = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        BubbleSort.bubbleSort(myArray);

        System.out.println("\nArray after sorting:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}