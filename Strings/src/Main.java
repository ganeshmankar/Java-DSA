public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String name = "Kunal Kushwaha";
//        System.out.println(name);

        String a = "Kunal";
        System.out.println(a);
        a = "Kushwaha";//new object in same pool and previous object in garbage
        System.out.println(a);
    }
}