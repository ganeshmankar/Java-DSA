import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7};
        int target = 6;
        System.out.println(search(arr, target, 0));

        System.out.println(findIndexStart(arr, target, 0));

        System.out.println(findIndexLast(arr, target, arr.length-1));

        findIndexDupli(arr, target, 0);
        System.out.println(list);

    }
    static boolean search(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    static int findIndexStart(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndexStart(arr, target, index+1);
    }
    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndexLast(arr, target, index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexDupli(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findIndexDupli(arr, target, index+1);
    }

}
