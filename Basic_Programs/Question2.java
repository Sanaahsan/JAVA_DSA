// WA function which returns true if a number is prime else return false using while loop
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean result=isPrime(num);
        System.out.println(result);
    }
    static boolean isPrime(int a){
        int i=1;
        int count=0;
        while(i<=a){
            if(a%i==0){
                count=count+1;
            }
            i=i+1;
        }
        if(count==2){
            return true;
        }
        else {
            return false;
        }
    }
}
