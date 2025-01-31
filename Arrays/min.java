public class min {
    public static void main(String[] args) {
        int arr[]={2,1,0,5,6,0,21,9};
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println(min);
    }
}
