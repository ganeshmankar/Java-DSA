import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Input using for loops
        //Array of primitives
//        int[] arr = new int[5];
//        for(int i=0; i<arr.length; i++){
//            arr[i]= in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        for (int num : arr) {
//            System.out.print(num + " "); //Here num represents elements of array
//        }

        //Array of objects
        String[] str= new String[4];
        for (int i= 0;i<str.length;i++){
            str[i]= in.next();

        }
        System.out.println(Arrays.toString(str));


        //modify
        str[1]= "ganu";
        System.out.println(Arrays.toString(str));

    }


}
