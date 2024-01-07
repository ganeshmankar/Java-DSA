import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 4);
//        System.out.println(diceRet("", 4));
//        System.out.println(diceCount("", 4));
        diceFace("", 5, 8);


    }
    static void dice(String p, int target){
        if (target == 0){
            System.out.print(p+ " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {

            ans.addAll(diceRet(p+i, target-i));
        }
        return ans;
    }

    static int diceCount(String p, int target){
        if (target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + diceCount(p+i, target-i);
        }
        return count;
    }

    static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.print(p+ " ");
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i, target-i, face);
        }
    }
}
