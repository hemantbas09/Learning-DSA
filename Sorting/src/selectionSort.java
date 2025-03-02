import java.util.Arrays;

public class selectionSort {
    //    Write a function to sort an array in descending order using Selection Sort.
    public static int[] descendingOrder(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return arr;
    }

//    Write a function that uses Selection Sort to find the Kth smallest element in an array.

    public static int findKthSmallest(int[] arr,int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k-1];
    }


    public static void main(String[] args) {

        int[] arr1 = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(descendingOrder(arr1)));
        System.out.println(findKthSmallest(arr1,2));
    }
}
