import java.util.Scanner;
public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println(i);
        }
    }
}
