public class Main {
    public static void main(String[] args) {
        triangle_patt1(4,0);
        triangle_patt2(4,0);

    }
    static void triangle_patt1(int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            System.out.print("*");
            triangle_patt1(row, col+1);
        }
        else{
            System.out.println();//for new line
            triangle_patt1(row-1,0);
        }
    }
    static void triangle_patt2(int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            triangle_patt2(row, col+1);
            System.out.print("*");

        }
        else{
            triangle_patt2(row-1,0);
            System.out.println();//for new line

        }
    }
}