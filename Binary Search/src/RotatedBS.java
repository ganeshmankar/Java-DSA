//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 5));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //If pivot not found -> Array not rotated
        if (pivot==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //pivot found means you have found 2 ascending sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0,pivot-1);
        }
        else{
            return binarySearch(nums, target, pivot+1,nums.length-1);

        }

    }
    //No duplicate values
     static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //4 cases
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){ //what if mid is end of arr..it will increase and out of bound error
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2; //If we write only (start + end)/2 it could exceed the size limit of int datatype
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }return -1;
    }
    //Use this when array contains duplicate elements
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
