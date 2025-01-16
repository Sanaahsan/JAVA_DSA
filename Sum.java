import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        sum(num1,num2);
        sub(num1,num2);
        mul(num1,num2);
        div(num1,num2);

        int ans1 = sum(num1, num2);
        System.out.println(ans1);


    }
    static int sum(int a, int b ){
       return a+b;
    }
    static void sub(int a, int b){
        System.out.println(a-b);

    }
    static void mul(int a, int b){
        System.out.println(a*b);

    }
    static void div(int a, int b){
        System.out.println(a/b);

    }
}

// Write 4 custom functions, that accept two integers and print their sum, product, difference and division
// 4 functions for 4 operationsb