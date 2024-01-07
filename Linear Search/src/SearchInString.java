import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name= "Ganesh";
        char target = 's';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String x, char y){
//        for (int i = 0; i < x.length(); i++){
//            if (y == x.charAt(i)){
//                return true;
//            }
//        }
//        return false;

        for (char ch : x.toCharArray()) {
            if(ch == y){
                return true;
            }

        }
        return false;
    }
}
