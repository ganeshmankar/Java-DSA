//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
    }
    int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int asc = AgnosticSearch(arr, target, 0, peak);
        if(asc != -1){
            return asc;
        }
        else{
            AgnosticSearch(arr, target, peak+1, arr.length-1);
        }return -1;
    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //You are in decreasing part of the array
                //This may be the ans still look at left
                end = mid; //it may be the ans so we are not saying mid - 1
            }
            else{//You are in ascending part of array
                start = mid + 1;
            }
        }
        //In the end, it will become start==end and it will point to the largest number coz of two checks above
        //Start and end are always trying to find max element in above two checks
        //Hence when they are pointing to only one element thats the ans

        return start;//or end
    }
    static int AgnosticSearch(int[]arr, int target, int start, int end){

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
