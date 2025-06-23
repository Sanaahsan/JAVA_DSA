public class Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
    }

    // write a function to implement linear search, return the index of the element if found else return -1. The function accepts an integer array and a target variable.
    static int linearSearch(int[] arr, int target){
        int index = -1; // initially we assume that the element is not present in the array

        // traverse the array and look for the element
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==target){  //comparing if the element at index i is equal to the target
                index = i; // if found, we will update the index and break the loop
                break;
            }
        }
        return index;  // return the final ans
    }

    // write a function to implement bianry search, return the index of the element if found else return -1. The function accepts an integer array and a target variable.
    static int binarySearch(int[] arr, int target){
        int index = -1;
        int start=0;
        int end= arr.length-1;
        while( )
        




        return index;
    }

    // how would you apply binary search on an array which is sorted in descending order ?

}
