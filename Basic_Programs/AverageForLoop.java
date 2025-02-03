import java.util.*;

public class AverageForLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter number of digits you want to enter:");
         int n= input.nextInt();

        
         int sum=0;

         for(int i=0;i<n;i++){
            System.out.println("Enter numbers:");
            int num= input.nextInt();
            sum=sum+num;
         }
         int average= sum/n;
         System.out.println(average);
         
    }
}
