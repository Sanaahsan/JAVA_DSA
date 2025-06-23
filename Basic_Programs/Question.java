// WAP with 4 custom functions for sum,product,diff,division of two numbers. The function should return answers(don't print in functions)
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int r1=sum(num1, num2);
        int r2=sub(num1,num2);
        int r3=mul(num1,num2);
        float r4=div(num1,num2);
        System.out.println(r1);
        System.out.println (r2);
        System.out.println(r3);
        System.out.println(r4);
    }
    static int sum(int a, int b){
        int Sum= a+b;
        return Sum;
    }
    static int sub(int a, int b){
        int Sub= a-b;
        return Sub;
    }
    static int mul(int a, int b){
        int mul= a*b;
        return mul;
    }
    static float div(int a, int b){
        float div= a/b;
        return div;
    }
     
}
