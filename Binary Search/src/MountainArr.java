//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,10,8,5,3,1};
        System.out.println(peakIndexInMountainArray(arr));

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
}
