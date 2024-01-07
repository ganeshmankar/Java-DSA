//Ceiling means finding that number or the number which is less than the target but greatest one
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 15));

    }
    //Return its index
    // Greatest number smaller than equal to target

    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

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
        }return end;
    }
}

