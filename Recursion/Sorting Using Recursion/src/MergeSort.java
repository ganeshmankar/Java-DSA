import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
//        int[] ans = mergeSort(arr);
//        System.out.println(Arrays.toString(ans));
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));  //will create a new object with that range and those elements
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);

    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){ //while anyone of this runs out of bound
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // Its possible than anu of the array is not complete
        // Copying the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }

    static void mergeSortInplace(int[] arr, int s, int e){  //we will update the array i.e no creation of any object just modifying given array
        if (e - s == 1){
            return;
        }
        int mid = (s + e)/2;

        mergeSortInplace(arr,s,mid);  //will create a new object with that range and those elements
        mergeSortInplace(arr,mid,e);

        mergeInplace(arr, s, mid, e);

    }
    static void mergeInplace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){ //i is going till mid only i.e first half(left part) and j is going till end i.e second half(right part)
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // Its possible than anu of the array is not complete
        // Copying the remaining elements
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
