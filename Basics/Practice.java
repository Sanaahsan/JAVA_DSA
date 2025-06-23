Simport java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count++;
            i=i+1;
        if(count==2){
            System.out.println("Prime");
        }        

            }
        }
    }
}
