import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int product = 1;
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum = sum + temp;
            product = product * temp;
            num = num / 10;

        }

        System.out.println(product - sum);
    }
}
