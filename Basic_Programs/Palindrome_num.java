import java.util.Scanner;
public class Palindrome_num {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num= input.nextInt();
        int original=num;
        int rev=0;
        while(num>0){
            int temp = num%10;
            rev= (rev*10)+temp;
            num=num/10;
        }
        if (original==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
