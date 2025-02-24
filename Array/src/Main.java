import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void studentArrays() {
        String[] names = new String[5];
        int[] age = new int[5];
        float[] weight = new float[5];

        names[0] = "Hemant";
        age[0] = 27;
        weight[0] = 34.5f;

        System.out.println("Name: " + names[0]);
        System.out.println("Age: " + age[0]);
        System.out.println("Weight: " + weight[0]);
    }

    void TwoDArray(){
        int [][] matrix={{1,2,3},{4,5,6}};
        int [][] numbers= new int [2][3];
        numbers[0][1]=10;

        System.out.println("2 D Array " + matrix[1][2]);
        System.out.println("Length of Array " + matrix.length);

    }

    void ArrayTraversing(){
        int [] numbers={1,2,3,4,5,6,7};

        for(int i=0;i<numbers.length;i++){
            System.out.println("Transverse using for loop "+ numbers[i]);
        }

        //enhanced for loop:
        for(int num:numbers){
            System.out.println("Transverse using  Enhanced for loop "+ num);
        }
    }

    void InputTaken(){

        Scanner inputValue= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size= inputValue.nextInt();
        int [] numbers= new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i=0; i<numbers.length;i++){
            numbers[i]= inputValue.nextInt();
        }

        System.out.println("Input Array: " + Arrays
                .toString(numbers));

    }

    public static void main(String[] args){
        Main obj=new  Main();
        obj.studentArrays();
        obj.TwoDArray();
        obj.ArrayTraversing();
        obj.InputTaken();
    }
}
