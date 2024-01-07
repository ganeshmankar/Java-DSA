public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {{23, 4, 1}, //we can use new int[][] here also to  initialise
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}};
        System.out.println(SearchMax(arr));
        System.out.println(SearchMin(arr));

    }
    static int SearchMax(int[][] arr){
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max){
//                    max = arr[row][col];
//                }
//            }
//        }return max;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }

    static int SearchMin(int[][] arr){
//        int max = arr[0][0];
        int min = Integer.MAX_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] < min){
//                    min = arr[row][col];
//                }
//            }
//        }return min;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;

    }

}
