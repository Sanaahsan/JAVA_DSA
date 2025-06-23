
// Sum of negative numbers, sum of positive even numbers,sum of positive odd numbers from a list of numbers n. The list should terminate when the user enters zero
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int odd_sum=0;
        int even_sum=0;
        int neg_sum=0;

        while (true) { 
            int num= input.nextInt();
            if(num==0){
                break;
            }
            else if(num<0){
                neg_sum=neg_sum+num;
                }
            else {
                if (num%2==0){
                    even_sum=even_sum+num;
                }
                else{
                    odd_sum=odd_sum+num;
                }
            }

        }
        System.out.println(neg_sum);
        System.out.println(odd_sum);
        System.out.println(even_sum);
        
    }
}
