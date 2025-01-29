import java.util.Scanner;
public class Armstrong_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int original = num;
        
        while(num>0){
            int temp=num%10;
            sum= sum +(temp*temp*temp);
            num= num/10;
        }
        if(original==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
    
}
