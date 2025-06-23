// Take an integer input "n" from the user and then create an array of size n. Then take inputs from the user to fill the array. Print the array at last.
// 2.first print the originalarray and then print the even numbers present in array

import java.util.Arrays;
import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[]arr= new int[n];

        // taking input in an array
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

       System.out.println(Arrays.toString(arr));

       for (int i = 0; i < arr.length; i++) {
           if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
           }
       }}
    
}

