import java.util.Arrays;
import java.util.Scanner;

public class PractiseQuestion {
    // 1. Write a Java program to initialize an array of 5 integers with user input and calculate the product of all elements.
    public static void calculateProduct(int[] arr) {
        int product = 1;
        for (int number : arr) {
            product = product * number;
        }
        System.out.println("The Product is "+product);
    }

    // 2. Create a program that finds and prints the median element of a sorted array of integers.
    // If the array length is even, print the average of the two middle elements.
    public static void findMedian(int[] arr) {
        int n = arr.length;
        double median;

        if (n % 2 == 1) {
            // Odd length: The median is the middle element
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println("Median: " + median);
    }

    // 3. Write a method to shift all elements of an array to the left by one position, moving the first element to the end.
    public static void shiftLeft(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println("Shifted Array: " + Arrays.toString(arr));
    }

    // 4. Given an array of integers, write a program to count how many elements are divisible by 3.
    public static void countDivisibleByThree(int[] arr) {
        int count=0;
        for(int num:arr){
            if(num%3==0){
                count++;
            }
        }

        System.out.println("Total Number divisible by 3: " + count);

    }

    // 5. Write a program to swap the first and last elements of an array and print the modified array.
    public static void swapFirstAndLast(int[] arr) {
        int first= arr[0];
           arr[0]= arr[arr.length-1];
           arr[arr.length-1]=first;

        System.out.println("Shifted Array: " + Arrays.toString(arr));

    }

    // 6. Create a program that finds the maximum difference between any two elements in an array (max(arr[j] - arr[i]) where j > i).
    public static void maxDifference(int[] arr) {
        int minElement = arr[0];
        int maxDifference=0;
        for (int j = 1; j < arr.length; j++) {
            maxDifference = Math.max(maxDifference, arr[j] - minElement);
            minElement = Math.min(minElement, arr[j]);
        }
        System.out.println("Maximum Difference: " + maxDifference);

    }

    // 7. Write a method to replace all negative elements in an array with 0 and print the updated array.
    public static void replaceNegatives(int[] arr) {
        // Empty
    }

    // 8. Given a square 2-D array (e.g., 3x3), write a program to calculate the sum of its main diagonal elements (top-left to bottom-right).
    public static int diagonalSum(int[][] arr) {
        return 0; // Placeholder return
    }

    // 9. Write a program to check if an array contains all unique elements (no duplicates) and return true or false.
    public static boolean hasUniqueElements(int[] arr) {
        return false; // Placeholder return
    }

    // 10. Write a method to increment each element of an array by a given value k and print the resulting array.
    public static void incrementElements(int[] arr, int k) {
        // Empty
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calling all methods with sample inputs
        int[] arr1 = new int[5]; // For Q1
        System.out.println("Enter 5 integers for Q1:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        calculateProduct(arr1);


        int[] arr2 = {1, 2, 3, 4, 5};
        findMedian(arr2);

        int[] arr3 = {1, 2, 3, 4}; // For Q3
        shiftLeft(arr3);

        int[] arr4 = {3, 4, 6, 7, 9}; // For Q4
         countDivisibleByThree(arr4);

        int[] arr5 = {1, 2, 3, 4}; // For Q5
        swapFirstAndLast(arr5);

        int[] arr6 = {2, 3, 1, 8, 5}; // For Q6
       maxDifference(arr6);

        int[] arr7 = {1, -2, 3, -4}; // For Q7
        replaceNegatives(arr7);

        int[][] arr8 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // For Q8
        System.out.println("Diagonal sum: " + diagonalSum(arr8));

        int[] arr9 = {1, 2, 3, 4}; // For Q9
        System.out.println("All unique: " + hasUniqueElements(arr9));

        int[] arr10 = {1, 2, 3}; // For Q10
        incrementElements(arr10, 5);

        sc.close();
    }
}