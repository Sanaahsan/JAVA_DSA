import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year= input.nextInt();
        if(year%400==0){
            System.out.println("It's a century and a leap year");
        }
        else if(year%100!=0 & year%4==0){
            System.out.println("Leap year");

        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
