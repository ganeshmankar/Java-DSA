import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        //out is reference variable of PrintStream class and println is method...its all happen inn background
        //printing process= valueOf -> toString
        //Arrays.toString means the toString method in arrays used to print arrays
        System.out.println(56);
        //println always controls the object in string using its toString so while printing
        // an array it will give diff output fot ignoring that we need to use array.toString function
//        Integer num = new Integer(56);
//        System.out.println(num.toString());
//        System.out.println(num);
//        System.out.println("Kunal");
//        System.out.println(new int[]{2, 3, 4, 5});
//        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));
////
//        String name = null;
//        System.out.println(name);
    }
}