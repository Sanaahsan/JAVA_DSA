

import java.util.*;


public class Rev{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n= sc.nextInt();

        int[]arr= new int[n];
       
       
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }

            int left=0;  //starting index
            int right= arr.length-1; //ending index

            {
                while(left<right){

                    int temp= arr[left]; //we are storing the value at index "left" in the variable temp.
                    arr[left]=arr[right];// updating the value at index left with the value at index right.
                    arr[right]=temp; //updating the value at index right with the value stored in variable temp.

                    left++;
                    right--;

            }
             
             }   
            System.out.println(Arrays.toString(arr));
        }
    }  




    
    
    
