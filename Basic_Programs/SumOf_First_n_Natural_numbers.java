import java.util.Scanner;

public class SumOf_First_n_Natural_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        for(int i=1; i<=n;i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
