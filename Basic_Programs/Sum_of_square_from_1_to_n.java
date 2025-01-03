import java.util.Scanner;

public class Sum_of_square_from_1_to_n {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int sum_of_square =0;
        for(int i =1; i<=n; i++){
            sum_of_square= sum_of_square + (i*i);
        }
        System.out.println(sum_of_square);
    }
}
