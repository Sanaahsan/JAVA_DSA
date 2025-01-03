import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int sum=0;

        while(num>0){
            int temp=num%10;
            sum= sum+temp;

            num=num/10;
            
        }
        System.out.println(sum); 
        
        

    }
}
