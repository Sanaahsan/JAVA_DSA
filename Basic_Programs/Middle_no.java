import java.util.Scanner;

public class Middle_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(b<a & c>a || b>a & c<a){
            System.out.println(a+" "+"is the middle number");
        }
        else if(a<c & b>c || a>c & b<c){
            System.out.println(c+" "+"is the middle number");
        }
        else{
            System.out.println(b+" "+"is the middle number");
        }
    }
    
}
