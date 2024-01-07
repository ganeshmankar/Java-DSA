import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while(s <= e){
            //It will check if all s and e are greater and less than pivot
            while (arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            //When above condn get destroy
            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //Here pivot will be at correct index, so sort the halves
        //e is now pivot-1
        //s is now pivot+1
        sort(arr, low, e);
        sort(arr, s, high);


    }
}
