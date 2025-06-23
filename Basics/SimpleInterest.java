import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Principal = input.nextInt();
        int Rate = input.nextInt();
        int Time = input.nextInt();

        
        double SI= (Principal*Rate*Time)/100f;
        System.out.print(SI);

        
        
    }
}
