import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths("", board, 0,0);
    }
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.print(p+" ");
            return;
        }
        if (!maze[r][c]){
            return;
        }
        //Considering this block in my path
        //Make a change
        maze[r][c] = false;


        if (r < maze.length-1){
            allPaths(p+ 'D', maze, r+1, c); //Neeche ke rasta
        }
        if (c < maze[0].length-1){ //right kaa rasta
            allPaths(p+ 'R', maze, r, c+1);
        }
        if (r > 0){ //Upar ke raste se jane ke liye
            allPaths(p+ 'U', maze, r-1, c);
        }
        if (c > 0){ //left ke raste se jane ke liye
            allPaths(p+ 'L', maze, r, c-1);
        }
        //Here function will be over
        //So before function gets removed, alse remove the changes that were made by that function
        //This is backtracking
        //Reverse the change
        maze[r][c] = true;
    }
}
