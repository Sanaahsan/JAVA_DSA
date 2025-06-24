// Given an array nums of integers, return how many of them contain an even number of digits.

package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Even_num_search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        

        // input
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        // calling the method
        System.out.println(even(nums));

    }

    // iteration
    static int even(int[] nums){
            if(nums.length==0){
                return 0;
            }
            // count of even numbers
          int count=0;  
          
        for(int i=0; i<nums.length; i++){
            // count of digits of individual number
            int digitsOfNums=0;
            while(nums[i]!=0){
               nums[i]=nums[i]/10;
                digitsOfNums++;
            }
            if(digitsOfNums%2==0){
                count++;
            }
           
            
        }
         return count;

             }
}
