// Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sum=0;
        
        while (true) { 
            int num= input.nextInt();
            if(num==0){
                break;
            }
            else{
                sum=sum+num;
            }
            
        }
        System.out.println(sum);
    }
        // for(int i=1; i>0; i++){
        //     int num = input.nextInt();
        //     if(num==0){
        //         break;
        //     }
        //     else{
        //         sum=sum+num;
        //     }

           
        
   }   


