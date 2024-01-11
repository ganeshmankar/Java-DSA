import java.util.Arrays;
//https://docs.oracle.com/javase/tutorial/java/generics/index.html
public class CustomGenericArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //Also working as index value

    public CustomGenericArraylist(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy th current items in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

//        CustomGenericArraylist list = new CustomGenericArraylist();
//        list.set(0,1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.size);

//        System.out.println(list);

        CustomGenericArraylist<Integer> list2 = new CustomGenericArraylist<>();
        for (int i = 0; i < 14; i++) {
            list2.add(2*i);
        }
        System.out.println(list2);
    }
}
