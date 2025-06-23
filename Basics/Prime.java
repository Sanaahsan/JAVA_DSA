
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int count = 0;
         int i=1;
        while(i<=a){
            if (a%i==0){
                count=count+1;
            i=i+1;
        if(count==2){
            System.out.println("Prime");
            break;

        }
            
            }
        }if(count>2){
            System.out.println("Not Prime");
        }
    }
}
