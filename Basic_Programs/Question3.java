// WA function which returns true if a number is prime else return false using for loop

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        boolean result=isPrime(num);
        System.out.println(result);

    }
    static boolean isPrime(int a){
        int count =0;
        for(int i=1; i<=a;i++){
            if (a%i==0){
                count++;
            }
        }

        if (count==2){
            return true;
        }
        else{
            return false;
        }
        
    }


}
