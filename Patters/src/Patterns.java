public class Patterns {
    public static void main(String[] args) {
        patt7(5);
    }
    static void patt1(int n){
        for (int row = 1; row <= n; row++) {//for every row run col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt2(int n){
        for (int row = 1; row <= n; row++) {//for every row run col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt3(int n){
        for (int row = 1; row <= n; row++) {//for every row run col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt4(int n){
        for (int row = 1; row <= n; row++) {//for every row run col
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt5(int n){
        for (int row = 0; row < 2 * n; row++) {//for every row run col
            int totColsInRow = row > n ? 2 * n - row : row;   //calculate this on ur own
            for (int col = 0; col < totColsInRow; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt6(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totColsInRow = row > n ? 2 * n - row : row;   //calculate this on ur own

            int noOfSpaces = n - totColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totColsInRow; col++) {
                System.out.print("* ");
            }
            //when 1 row is printed we need to add new line
            System.out.println();
        }
    }
    static void patt7(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}