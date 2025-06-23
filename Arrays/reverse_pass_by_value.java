
import java.util.Arrays;

public class reverse_pass_by_value {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        revArr(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void swapArr(int s,int e, int[]arr2){
        int temp = arr2[s]; // arr[0]
        arr2[s] = arr2[e];
        arr2[e] = temp;
    }

    static void revArr(int[]arr3){
        int s = 0;
        int e = arr3.length-1;
        while(s<e){
            swapArr(s, e, arr3);
            s++;
            e--;
        }
    }
}
