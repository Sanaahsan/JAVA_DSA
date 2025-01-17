
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        max(num1, num2);
    }
    static void max(int a, int b){
        if (a>b){
            System.out.println("a is max");
        }
        else{
            System.out.println("b is max");
        }
    }
}
