import java.util.Arrays;

public class basicProblem {
    // 1. Q1. Swap using temporary variable
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The Value of a is " + a);
        System.out.println("The Value of b is " + b);
    }

    // 2. Q2. Swap using sum and difference
    public static void swapWithoutTemp(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("The Value of a is " + a);
        System.out.println("The Value of b is " + b);
    }

    // 3. Q3. Reverse an array:
    public static void reverse(int[] arr) {
        int[] reverseArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[j++] = arr[i];
        }
        System.out.println("The Value of new is " + Arrays.toString(reverseArray));

    }

    // 4. Q4. Rotate the given array a by 'k' steps: where k is non-negative number Note: k might be greater then n as well;
    public static void rotate(int[] arr, int steps) {
        int n = arr.length;
        int k = steps % n;
        int[] result = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            result[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            result[j++] = arr[i];
        }

        System.out.println("The rotate array with extra space " + Arrays.toString(result));
    }

    // 5. Q5. Rotate the array by 'k' steps without extra space:
    static void swap(int[] arr, int i, int j) {

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateAgain(int[] arr, int steps) {
        int n = arr.length;
        int k = steps % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("The rotate array without extra space " + Arrays.toString(arr));
    }

    // 6. Q6. Check if a number is present in the array or not
    public static void checkNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                System.out.println("The Number is present");
                return;
            }
        }

        System.out.println("The Number is not present");
    }

    public static void main(String[] args) {
        swap(5, 10);
        swapWithoutTemp(2, 12);
        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 12};
        reverse(number1);
        int[] number2 = {1, 2, 3, 4, 5, 6};
        rotate(number2, 3);
        rotateAgain(number2, 3);
        checkNumber(number1,122);
    }

}

