// Take integer inputs till the user enters 0 and print the largest number from all 
import java.util.Scanner;
public class Largest_of_n_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        //if it's largest num, we need to use Integer.MIN_VALUE, If it's smallest num, we need to use Integer.MAX_VALUE
        while(true){
            int num=input.nextInt();
            if (num==0){
                break;
            }
            else{
                if(num>max){
                    max=num;
                }
            }
        }
        System.out.println(max);
        
    }
}
