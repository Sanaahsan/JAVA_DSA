import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int i = 1;
        
        while(num>0){
            
            if(num%i==0){
                System.out.println(i);
            }
            i++;

           
        }
    }       
}
