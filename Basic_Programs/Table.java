import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        
        for(int i=1; i<=10; i++){
            int table= num*i;
            System.out.println(num+"*"+i+"="+table);

        }
    }
}
