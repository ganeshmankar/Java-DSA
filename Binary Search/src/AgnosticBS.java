public class AgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-13, -7, -2, 4, 9, 13, 25, 39, 47, 56, 69};
        int []arr1 = {69, 56, 47, 39, 25, 13, 9, 4, -2, -7, -13};
        System.out.println(AgnosticSearch(arr, 39));
        System.out.println(AgnosticSearch(arr1, 47));

    }

    static int AgnosticSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
//        boolean isAsc = arr[0] < arr[arr.length-1];
        if(arr[0] < arr[arr.length-1]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
