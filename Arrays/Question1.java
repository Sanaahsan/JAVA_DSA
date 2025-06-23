// 1) Take an integer n and then create an arrays of size 'n', then take inputs from the user and print the array.
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size :");
        int n= input.nextInt();
        
        int[]arr=new int[n];
        System.out.println("Enter elements:");

        for(int i=0; i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }   
}
