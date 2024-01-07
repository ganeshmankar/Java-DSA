import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {{23, 4, 1}, //we can use new int[][] here also to  initialise
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}};
        int target = 56;
        int[] ans = search(arr, target);//Format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int x){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == x){
                    return new int[] {row,col}; //Initialising array
                }
            }
        }return new int[] {-1,-1}; //Initialising array

    }
}
