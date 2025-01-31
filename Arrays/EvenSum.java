// Write a custom function that accepts an array and returns the sum of all the even numbers present in the array

import java.util.Arrays;

public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // int result=evenSum(arr);
        // System.out.println(result);
        System.out.println(evenSum(arr)); // System.out.println(30)
        System.out.println(oddSum(arr));
        System.out.println(arrSum(arr));

        System.out.println(Arrays.toString(arr));
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
    }

    static int evenSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                sum = sum+arr[i];
            }
        }
        return sum;
    }

    static int oddSum(int[] arr){
      int sum  =0;
      for(int i =0; i<arr.length;i++){
        if(arr[i]%2!=0){
            sum= sum+arr[i];
        }
      } 
      return sum;   
    }

    static int arrSum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}


