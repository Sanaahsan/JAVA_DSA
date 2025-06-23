import java.util.Scanner;
public class Perfect_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        int original=num;
        
        int i = 1;
        
        while(num>0){
            
            if(num%i==0){
                int temp= i%10;
               sum=sum+temp;
            }
            i++;
        


    }
    if(num==original){
        System.out.println("Perfect Number");
    }
    else{
        System.out.println("Not Perfect");
    }

    }
}
