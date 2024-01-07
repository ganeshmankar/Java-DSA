import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,9,4,5,3,8,6,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
