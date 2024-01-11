public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,8};
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //This is shallow copy
//        return super.clone();
//    }


    protected Object clone() throws CloneNotSupportedException {
        //This is deep copy
        Human twin = (Human) super.clone();//This is shallow copy

        //Make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

