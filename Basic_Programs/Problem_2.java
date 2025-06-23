// Kunal is allowed to go out on even days of the month. Count the number of days he's allowed to go out in the month of August.
public class Problem_2 {
    public static void main(String[] args) {
        int count =0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }
        }

        // int days=1;
        // while(days<=31){
        //     if(days%2==0){
        //         count++;
               
        //     }
        //     days++;

        // }
        
        System.out.println(count);
    }


}
