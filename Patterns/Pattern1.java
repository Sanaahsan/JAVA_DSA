package Patterns;
public class Pattern1 {
    public static void main(String[] args) {
         for(int row=1; row<=5;row++){
           for(int col=1; col<=row; col++){
            System.out.print("* ");
           }
        //    when one line is printed we need to go to new line
        System.out.println();
         }
    }
}
// Steps
// 1. no. of lines = no. of rows= no. of times outer loop will run
// 2. identifyfor every row no.
    // ~ how many columns are there
    // ~ types of elements in cols
// print the next line