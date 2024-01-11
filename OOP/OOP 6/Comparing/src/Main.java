import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ganesh = new Student(12, 84.96f);
        Student devang = new Student(26, 89.07f);
        Student saurabh = new Student(32, 99.09f);
        Student rakesh = new Student(24, 98.97f);
        Student ayush = new Student(71, 95.45f);
        Student rahul = new Student(73, 99.99f);

        Student[] list = {ganesh, devang, saurabh, rakesh, ayush, rahul};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (ganesh.compareTo(devang) < 0){ //Confused about comparing between parameters
//            System.out.println(ganesh.compareTo(devang));
//            System.out.println("Devang has more marks!");
//        }
    }
}
