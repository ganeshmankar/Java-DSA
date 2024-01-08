import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10, "Ganesh");

        //Need to do few things
        // 1. Access the data members
        // 2. Modify the data members

        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;

//        obj.num; //can't access if num is private

        obj.getNum();
        int n = obj.num;

    }
}
