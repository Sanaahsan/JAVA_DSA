
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1 = input.nextInt();
        int num2= input.nextInt();
        char Operator = input.next().charAt(0);
        switch(Operator){
            case '+'->System.out.print(num1+num2);
            case '-'->System.out.print(num1-num2);
            case '*'->System.out.print(num1*num2);
            case '/'->System.out.print(num1/num2);
            default->System.out.print("Not a valid operator");
        }
    }
}
