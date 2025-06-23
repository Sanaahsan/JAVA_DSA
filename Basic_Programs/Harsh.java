public class Harsh {
    public static void main(String[] args) {
        int[] arr = {542, 196, 72, 49, 53};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            int sod = sumOfDigits(arr[i]);
            ans += sod;
        }
        
        int result=sumOfDigits(ans);
        System.out.println(result);

    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
        return sum;
    }
}
