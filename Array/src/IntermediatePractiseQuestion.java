public class IntermediatePractiseQuestion {
    /*
    1. Find the total number of pairs in the Array whose sum is equal to the given value x:
    * */

    public static void countPairsWithSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        System.out.println("The number of pairs in the array whose sum equals " + target + " are " + count);
    }

    /*
    2. count the number of triplets whose sum is equal to the given x:
    * */

    public static  void countTripletsWithSum(int[]arr, int target){
        int count=0;
        int arrayLength=arr.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i+1; j < arrayLength; j++) {
                for (int k = j+1; k < arrayLength; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        count ++;
                    }
                }
            }
        }

        System.out.println("The number of triplets in the array whose sum equals " + target + " are " + count);

    }

    /*
    *
    * Array Manipulation:
    *3.Find the unique number in a given Array where all the elements are beings repeated twice with one value beings unique:
    * [1,2,3,4,2,1,3]
    *
    * */


    public static void uniqueNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                    break;
                }
            }
            if (arr[i]>0) {
                System.out.println("The unique number is " + arr[i]);
            }
        }
    }

    /*
    4. Program to find the second-largest element in the given array
    [1,2,4,5,9,7,3,12,78]
    * */

     static int findMax(int[]arr){
        int largestValue=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (largestValue<arr[i]) {
                largestValue=arr[i];
            }
        }
        return largestValue;
    }

    public static void secondLargestElement(int[]arr){
        int max= findMax(arr);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondLargestValue=findMax(arr);
        System.out.println("The Second Larges number is " + secondLargestValue);

    }

    /**
     *
     *5.For an array of integers return the first value that is repeating in the array;
     */

    public static void findFirstRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The First repeating number is " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("The First repeating number is " + -1);
    }


    public static void main(String[] args){
        int []numbers1={1,2,3,4,5,6,7,8,9};
        countPairsWithSum(numbers1,7);

        int []numbers2={1,4,5,6,3};
        countTripletsWithSum(numbers2,12);

        int [] number3={1,2,3,4,2,1,3};
        uniqueNumber(number3);

        int [] number4={1,2,4,5,9,7,3,12,78,58};
        secondLargestElement(number4);

        int [] number5={1,5,3,4,6,3,4,1};
        findFirstRepeat(number5);
    }
}


