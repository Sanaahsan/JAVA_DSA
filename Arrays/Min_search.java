public class Min_search {
 public static void main(String[] args) {
    int[] arr= {18,12,-7,3,14,28};
    int min= arr[0];
    System.out.println(min(arr, min));
 }  
  static int min(int[] arr, int min){
    for(int i=0; i<arr.length;i++){
        if(min>arr[i]){
            min= arr[i];
            
        }
    }
    return min;
  } 
}
