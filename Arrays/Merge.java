import java.util.*;

public class Merge {
    public static void main(String[] args) {
        
        int[] arr1={2,7,9,11,14};
        int[] arr2={1,5,9,12,13,17,20};

        // resultant index should be sum of both index
        
        int a1= arr1.length;
        int a2= arr2.length;

        int a3= a1+ a2; //size of o/p

        int[] array3= new int[a3];

        for(int i=0;i<a1;i++){ //for arr1
            array3[i]= arr1[i];
        }

        for(int i=0;i<a2;i++){ //for arr2
            array3[a1+i]=arr2[i];
        }

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

    }

    

}
// o/p {1,2,5,7,9,9,11,12,13,14,17,20}