import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        palin(num);
    }
    static void palin(int n){
        
        int original=n;
        int rev=0;
        while(n>0){
            int temp = n%10;
            rev= (rev*10)+temp;
            n=n/10;
        }
        if (original==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        

    }

    
}
