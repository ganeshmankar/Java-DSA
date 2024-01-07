public class Nto1 {
    public static void main(String[] args) {
//        next(5);
        nextBoth(3);
    }


    // concept
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }


    static void next(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        next(n-1);
    }


    static void nextRev(int n){
        if (n == 0){
            return;
        }
        nextRev(n-1);
        System.out.println(n);
    }


    static void nextBoth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        nextBoth(n-1);
        System.out.println(n);
    }
}
