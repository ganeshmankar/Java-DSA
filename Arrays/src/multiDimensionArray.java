import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input


        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { //arr[row].length means size of row...every row itself is an array
                arr[row][col] = in.nextInt();
            }
        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();//After printing row we have to print new line
//        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for(int[] a : arr) { //considering every element as 'a' in array and printing it
//            System.out.println(Arrays.toString(a));
//        }
    }
}