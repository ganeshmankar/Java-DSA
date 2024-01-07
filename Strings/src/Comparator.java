public class Comparator {
    public static void main(String[] args) {
        //String pool and immutability
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2); //ref variables are pointing to same object or not

        System.out.println(name1.equals(name2)); //only checks the value

    }
}