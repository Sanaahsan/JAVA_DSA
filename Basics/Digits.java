import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int a = sc.nextInt();
            int sum = 0;
            
            while (a>0){
                
                sum = sum + a%10 ;
                
                a=a/10;

            }
            System.out.println(sum);
        }
         
       
        
        

    }
}
