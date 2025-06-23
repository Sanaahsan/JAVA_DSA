public class SecondLargest {
    public static void main(String[] args) {
        
        int [] arr={5,4,7,3,6,2,7,10};
        int max= Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
                //10
                System.out.println(max);
            }
             if (arr[i]<max && arr[i]>secondLargest) {
                 secondLargest=arr[i];
                 System.out.println(secondLargest);
             }
            
        }
        
        System.out.println(secondLargest);
    }
}
