import javax.lang.model.type.ArrayType;
//https://leetcode.com/problems/missing-number/
import java.util.Arrays;
class MissingNoCS {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] != arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //Search for missing nummber
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        //Case 2
        return arr.length;

    }
    private static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
