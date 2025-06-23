public class Search_range {

    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        int target = 3;
        System.out.println(find(arr, target, target, target));
    }

    static boolean find(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
