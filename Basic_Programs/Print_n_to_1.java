import java.util.Scanner;
public class Print_n_to_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n; i>=1;i--){
            System.out.println(i);
        }
    }
}
