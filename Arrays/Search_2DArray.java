public class Search_2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {8,99,34,56},
            {18,12}
        };
        int target=34;
        
        System.out.println(find(arr, target));
    }
    static boolean find(int[][]arr, int target){
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }

}
