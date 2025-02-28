//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //    Write a program to print all natural number form 1 to n using recursion:
    public static void naturalNumber(int n) {
        if (n == 1) {
            System.out.println("Number is " + n);
            return;
        }
        naturalNumber(n - 1);
        System.out.println("Number is " + n);

    }

    //    Write a program to print all natural number form n to 1 using recursion:
    public static void naturalNumbers(int n) {
        if (n == 1) {
            System.out.println("Number is " + n);
            return;
        }
        System.out.println("Number is " + n);
        naturalNumbers(n - 1);

    }

//    Find the value of n factorial ?

    public static int calculateFactorial(int n) {
//        base case:
        if (n == 0) return 1;
        return n * calculateFactorial(n - 1);
    }

//    Find the nth fibonacci number ?

    public static int calculateFibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    //    Given an integer, find out the sum of its digits using recursion
    public static int calculateSum(int n) {
        //base case:
        if (n == 0) {
            return 0;
        }
        return (n % 10) + calculateSum(n / 10);
    }
// Given two numbers p and q, find p^q using recursion.

    public static int calculatePower(int p, int q) {
        //base case:
        if (q == 0) return 1;
        return calculatePower(p, q - 1) * p;
    }


    public static void main(String[] args) {
//        naturalNumber(8);
//        naturalNumbers(5);
//        System.out.println("The factorials " + calculateFactorial(4));

        System.out.println(calculateFibonacci(10));
        System.out.println("The sum of the digits in give number " + calculateSum(4567));
        System.out.println(calculatePower(2,5));
    }
}
