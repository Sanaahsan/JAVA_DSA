import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("We are studying functions");  
        // greet(); // calling a function 
        // helloWorld();
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String ch = "harsh";
        sum(num1, num2); // call 1
        // arguments
        sum(5,6); // call 2

    }

    // static void greet(){ // creating/declaring a function
    //     Scanner input = new Scanner(System.in);
    //     String name1 = input.next().trim();
    //     System.out.println("hello "+ name1);
    // }

    // static void helloWorld(){
    //     System.out.println("Hello World");
    // }

    static void sum(int n1, int n2){ // declaring --> parameters
        System.out.println(n1+n2);
    }

}
