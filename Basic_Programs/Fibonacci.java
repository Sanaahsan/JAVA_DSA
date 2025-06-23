// 01123
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first=0;
        int second=1;
        
         
         if(n<=0){
            System.out.println("Error");
         }
         else if(n==1){
            System.out.println(first);
         }
         else if(n==2){
            System.out.println(first);
            System.out.println(second); 
         }
         else{
            System.out.println(first);
            System.out.println(second); 
            for(int i=3; i<=n;i++){
                int third=(first + second);
                System.out.println(third);
    
                first = second;
                second = third;
            }
         }
         
         

         
        

    }
}
