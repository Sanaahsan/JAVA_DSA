import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int important = fact(num);
        System.out.println(important);
        fact(num);
        
    }
    static int fact(int n){
        int factorial=1;
        while(n>0){
            factorial=factorial*n;
            n--;
        }

        return  factorial;
        
    }
}
