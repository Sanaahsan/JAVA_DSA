import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int Principal= input.nextInt();
        int Rate= input.nextInt();
        int Time = input.nextInt();
        double SimpleInterest = (Principal*Rate*Time)/100f;
        System.out.println(SimpleInterest);
        
    }
}
