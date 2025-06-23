
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,6,1,78,45,77,24,99};
        int target = 24;

        // boolean isPresent = false;
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }

        // System.out.println(isPresent);
        System.out.println(index);
    }

    
}
