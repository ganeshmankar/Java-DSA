import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //running till n-1
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each pass, max item will come at its respective pos
            for (int j = 1; j < arr.length-i; j++) {
                //swap
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //If  you did not swap for a particular i means array is sorted so break loop
            if (!swapped){ //no swap occurs check using debugging by putting sorted array
                break;
            }
        }
    }
}

