import java.util.Arrays;
import java.util.Scanner;

public class Syntax{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); // size of the array
        int[] arr = new int[size]; // declaring the aray
        System.out.println("Enter the elements:");

        // taking input in the array, 
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        } 

        // traversing an array
        // for(int i=0; i<size; i++){
        //     System.out.println(arr[i]);
        // } 

        System.out.println(Arrays.toString(arr)); //Arrays.toString() is an in-build method used to print an array
    }
}