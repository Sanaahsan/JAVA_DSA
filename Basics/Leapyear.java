
import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        if(n%400==0){
            System.out.println("It's a leapyear and a century");
        }
        else if (n%100!=0 & n%4==0){
            System.out.println("It's a leapyear");
        }
        else{
            System.out.println("Not a leapyear");
        }
    }
}
