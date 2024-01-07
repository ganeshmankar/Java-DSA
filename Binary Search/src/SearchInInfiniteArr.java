//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//Given array is infinite hence we can't use length function
public class SearchInInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // find range
        //starting with box of size 2
        int start = 0;
        int end = 1;

        //condition for target to lie in range
        while (target > arr[end]){
            int temp = end + 1;//this is new start
            //double box value
            //new end = prev end + box size*2
            end = end + (end - start + 1)*2;//here we must use old start so update new start later
            start = temp;
        }
        return binarySearch(arr, target, start, end);
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
}
