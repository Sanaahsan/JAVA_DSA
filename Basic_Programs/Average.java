import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum = 0;
        int count = 0;
        

        while (true) { //infinite loop
            System.out.println("Enter number or type 'q' to quit");
            String n= input.next().trim();
            if(n.equals("q")){
                break;
            }
            else{
                int num= Integer.parseInt(n); //string to integer
                
                sum = sum + num ;
                count++;
            }
        }
        double average = (double)sum/count;
        System.out.println(average);
    }
    
}

