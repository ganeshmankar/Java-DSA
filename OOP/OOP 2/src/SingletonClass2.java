public class SingletonClass2 {
    public static void main(String[] args) {
        SingletonClass1 obj1 = SingletonClass1.getInstance();
        SingletonClass1 obj2 = SingletonClass1.getInstance();
        SingletonClass1 obj3 = SingletonClass1.getInstance();

        //All three reference are pointing to the same object

    }
}
