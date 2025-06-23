import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        
        int count=0;
        int i=1;
        while(i<=n){
            if (n%i==0){
                
            count=count+1;
            }
            i=i+1;
        } 
        if (count==2){
            System.out.println("Prime Number");
        }
            else{
                System.out.println("Not Prime");
            }
    }  
}
