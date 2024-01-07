public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {18, 12, -7, 3, 14, 28};
        int target= 14;
        System.out.println(search(arr, 0, 5, 14));
    }
    static boolean search(int[] arr, int start, int end, int x){
        for (int i = start; i <= end ; i++) {
            if (arr[i] == x){
                return true;
            }

        }
        return false;
    }
}
