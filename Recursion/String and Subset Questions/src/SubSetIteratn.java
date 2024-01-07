import java.util.ArrayList;
import java.util.List;

public class SubSetIteratn {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for (List<Integer> list: ans){
            System.out.print(list+" ");
        }
    }
    static List<List<Integer>> subSet(int[] arr){
        //We are creating outer list
        //This outer list is consist of original and an internal list
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                //This is the new list with is getting created and added in original list
                List<Integer> internal = new ArrayList<>(outer.get(i)); //outer.get(i) will create copy of original list and just replace that with new number
                internal.add(num);
                outer.add(internal); //This will add our new list in original one
            }
        }
        return outer;
    }
}
