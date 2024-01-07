public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {23,45,67,12,-7,89,54,64};
        System.out.println(FindMin(arr));
        System.out.println(FindMax(arr));
    }

    static int FindMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] < min){
                min = arr[i];
            }

        }return min;
    }
    static int FindMax(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] > min){
                min = arr[i];
            }

        }return min;
    }
}
