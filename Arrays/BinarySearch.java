public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 700;
        int index = -1;

        int low = 0;
        int high = arr.length -1;

        while(low <=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                index = mid;
                break;
            } else if(arr[mid] > target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element was found at index: " +index);
        }
    }
}
