import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        number(num);

    }
    static void number(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
