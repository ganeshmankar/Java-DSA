import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(counts(3,3));
//        path("", 3,3);
//        System.out.println(pathRet(" ", 3,3));
        System.out.println(pathRetDiagonal(" ", 3,3));

    }
    
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }
        if (r > 1){
            path(p+'D', r-1, c);
        }
        if (c > 1){
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r > 1){
            ans.addAll(pathRet(p+'D', r-1, c));
        }
        if (c > 1){
            ans.addAll(pathRet(p + 'R', r, c-1));
        }
        return ans;
    }


    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if (r > 1){
            ans.addAll(pathRetDiagonal(p+'H', r-1, c));
        }
        if (r>1 && c>1){
            ans.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }
        if (c > 1){
            ans.addAll(pathRetDiagonal(p + 'V', r, c-1));
        }
        return ans;
    }
    
    static int counts(int r, int c){
        //Ways to go from point A to point B
        if (r == 1 || c == 1){
            return 1;
        }
        //For this watch its tree
        int left = counts(r-1, c);
        int right = counts(r, c-1);

        return left+right;
    }
    
    
}
