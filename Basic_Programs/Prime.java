// Write a custom function, that accepts a integer number and returns if its prime or not

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;

        while(n>0){
            int d = n%10;
            rev = (rev * 10) +d;
            n =n/10;
        }

        if(original == rev){
            return true;
        }
        else{
            return false;
        }
    }
}
