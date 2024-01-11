import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ganesh = new Human(21, "Ganesh Mankar");
//        Human twin = new Human(ganesh);

        Human twin = (Human) ganesh.clone();

        System.out.println(twin.age +" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 10;

        System.out.println(Arrays.toString(ganesh.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
