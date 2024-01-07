//Ceiling means finding that number or the number which is greater than the target but smallest one
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceiling(arr, 15));

    }
    //Return its index
    // Smallest number greater than equal to target

    static int ceiling(int[] arr, int target){

        //if target no is greater than the greatest no in ceiling
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        }return start;
    }
}

