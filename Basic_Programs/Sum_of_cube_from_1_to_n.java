import java.util.Scanner;
public class Sum_of_cube_from_1_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum_of_cube= 0;
        for(int i=1; i<=n; i++){
            sum_of_cube= sum_of_cube + (i*i*i);

        }
        System.out.println(sum_of_cube);
    }
}
