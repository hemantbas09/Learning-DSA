import java.util.Arrays;

public class bubbleSort {
    /*
     * Problem 1: Sort and Count Swaps
     *
     * You are given an array of integers. Sort the array in ascending order using
     * the Bubble Sort algorithm. Additionally, count the number of swaps performed
     * during sorting.
     *
     * Input:
     * N = 5
     * arr = [5, 3, 8, 4, 2]
     *
     * Output:
     * Sorted Array: [2, 3, 4, 5, 8]
     * Total Swaps: 5
     */

    public static int[] ascendingOrder(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Swap Count " + swapCount);
        return arr;
    }



    /*
     * Problem 2: Bubble Sort with Early Termination
     *
     * Modify the Bubble Sort algorithm to stop early if the array is already sorted
     * before completing all passes. Implement an optimized version of Bubble Sort
     * and print how many passes were required.
     *
     * Input:
     * N = 6
     * arr = [1, 2, 3, 4, 5, 6]
     *
     * Output:
     * Sorted Array: [1, 2, 3, 4, 5, 6]
     * Passes Taken: 1
     */

    public static int[] bubbleSortWithEarlyTermination(int[] arr) {
        int n = arr.length;
        int passes = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Passes Taken: " + passes);
        return arr;
    }


    public static void main(String[] args) {

        int[] arr1 = {5, 3, 8, 4, 2};
        System.out.println(Arrays.toString(ascendingOrder(arr1)));
    }
}
