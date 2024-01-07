import java.util.Arrays;

public class PrintPaths {
    public static void main(String[] args) {
        boolean [][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathsPrint("", board, 0,0, path, 1);
    }
    //Printing steps amd matrix
    static void allPathsPrint(String p, boolean[][] maze, int r, int c,int[][] path, int step){
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;  //The last step will also be a step so
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        //Considering this block in my path
        //Make a change
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length-1){
            allPathsPrint(p+ 'D', maze, r+1, c, path, step+1); //Neeche ke rasta
        }
        if (c < maze[0].length-1){ //right kaa rasta
            allPathsPrint(p+ 'R', maze, r, c+1, path, step+1);
        }
        if (r > 0){ //Upar ke raste se jane ke liye
            allPathsPrint(p+ 'U', maze, r-1, c, path, step+1);
        }
        if (c > 0){ //left ke raste se jane ke liye
            allPathsPrint(p+ 'L', maze, r, c-1, path, step+1);
        }
        //Here function will be over
        //So before function gets removed, alse remove the changes that were made by that function
        //This is backtracking
        //Reverse the change
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
