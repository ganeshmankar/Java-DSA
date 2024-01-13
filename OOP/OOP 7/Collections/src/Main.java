import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(12);
        list2.add(24);
        list2.add(36);
        list2.add(48);

        System.out.println(list2);

    }
}