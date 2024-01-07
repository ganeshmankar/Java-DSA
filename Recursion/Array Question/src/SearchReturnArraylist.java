import java.util.ArrayList;
public class SearchReturnArraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7};
        int[] arr1 = {1,2,4,6,9,9,9,9,11,17};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, target, 0, list);
        System.out.println(ans);
        System.out.println(list);

        System.out.println(findAllIndex2(arr1, 9, 0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> anslList){
        if (index == arr.length){
            return anslList;
        }
        if (arr[index] == target){
            anslList.add(index);
        }
        return findAllIndex(arr, target, index+1, anslList);
    }

    //Without Arraylist as parameter
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        // This will contain the answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromPrevCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromPrevCalls);

        return list;
    }
}
