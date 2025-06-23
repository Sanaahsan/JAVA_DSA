import java.util.*;

public class Currency{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rupees= input.nextFloat();

        float dollars= rupees/96;
        System.out.println(dollars);
    }
}