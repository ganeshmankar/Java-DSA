import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }
    //Search in the provided row between provided columns from search function
    static int[] binarySearch(int[][]matrix,int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious matrix may be empty

        if (rows == 1) { //for singular or 1d matrix
            return binarySearch(matrix, 0, 0, cols-1, target);//cols-1 means total columns - 1
        }
        int rStart = 0; //Lower Bound
        int rEnd = rows -1; //Total rows - 1 (Upper bound)
        int cMid = cols / 2; //Total columns / 2

        while(rStart < rEnd - 1){ //we need final two rows...while this condition is true it will have more than 2 rows which we are trying to eliminate
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] > target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }
        //Now we have 2 rows
        //Check whether the target is in mid column of 2 rows or not

        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){ //Checking at end i.e checking for 2 then checking for 6
            return new int[]{rStart + 1, cMid};
        }

        //Otherwise search in 1st half i.e 1
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1,target);
        }
        //Otherwise search in 2nd half i.e 3 4
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){ //target only between 3 and 4
            return binarySearch(matrix, rStart, cMid+1, cols-1,target);
        }
        //Otherwise search in 3rd half i.e  5
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1,target);
        }
        //Otherwise search in 4th half i.e 7 8
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols-1,target);
        }
    }
}
