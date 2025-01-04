import java.util.Scanner;
public class Sum_of_even_digits_bw_1_to_n {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i =1; i<=n; i++){
            if(i%2==0){
                sum= sum + i;
            }
        }
        System.out.println(sum);

    }
}
