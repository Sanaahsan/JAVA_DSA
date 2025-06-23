import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] rev = reverseArray(arr);
        System.out.println(Arrays.toString(rev));
    }
    // if the length of an array is n, then the last index of that array would be
    // (n-1), as indexing starts from 0.

    // traverse the given array using a for loop
    // for(int index=0; index<arr.length; index++){
    // System.out.println(arr[index]);
    // }

    // System.out.println(Arrays.toString(arr));
    // arr[2] = 6;
    // System.out.println(Arrays.toString(arr));

    // // multiply the element at index number 1 by 4 and store it there only.
    // arr[1] = arr[1]*4;
    // System.out.println(Arrays.toString(arr));

    // Print the array in reverse
    // for(int i=arr.length-1; i>=0;i--){
    // System.out.print(arr[i]+ " ");
    // }

    // Write a custom function, that accepts an array as a parameter and returns
    // another array which is the reverse of the original array.

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[(arr.length - 1) - i];
        }
        return rev;

    }
// write a custom function that accepts an integer array and reverses it, it should modify the original array. It will return void.

}

