import java.util.Scanner;
public class Reverse_of_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int rev=0;
        
        while(num>0){
            int temp=num%10;
            rev= (rev*10)+temp;
            num=num/10;

        }
        
        System.out.println(rev);

    }
}
