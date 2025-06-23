
// Take an array input of size n and print the sum of all the numbers present in the array


public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {5,10,15,65,45,34};
        int sum=0;

        for(int i=0; i<arr.length;i++){
            sum= sum+ arr[i];

        }
        System.out.println(sum);

    }
}
