// 3)Find the largest number in an array.
public class max {
    public static void main(String[] args) {
        int[] arr ={1,5,3,2,9,7};
        int max= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
