import java.util.*;

public class Hey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("The sum of the numbers is " + (n1+n2));

        printText();

        System.out.println("The product of the numbers is " + (n1*n2));

        printText();

        System.out.println("The diff between the numbers is " + (n1-n2));

        printText();
    }

    static void printText(){
        System.out.println("Hey Harsh");
        System.out.println("Hey Sana");
        System.out.println("Hey Billu");
        System.out.println("Hey Kicchu");
    }
}
