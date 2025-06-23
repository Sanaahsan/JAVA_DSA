import java.util.*;

public class Sort {
    public static void main(String[] args) {
        
        int[] arr={5,4,3,0,5};
        Arrays.sort(arr);
    
        System.out.println(arr[arr.length-2]);
        System.out.println(Arrays.toString(arr));
    }
}
