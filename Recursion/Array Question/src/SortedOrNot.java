public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,12};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index){
        //Base Condition
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}
