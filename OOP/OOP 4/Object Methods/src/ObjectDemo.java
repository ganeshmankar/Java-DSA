public class ObjectDemo {

    int num;
    float cgpa;

    public ObjectDemo(int num, float cgpa){
        this.num = num;
        this.cgpa = cgpa;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num;
    }
    @Override
    public boolean equals(Object obj) {

//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12, 56.8f);
        ObjectDemo obj1 = new ObjectDemo(12, 78.9f);

        if (obj == obj1){
            System.out.println("obj is equal to obj1");
        }

        if (obj.equals(obj1)){
            System.out.println("obj is equal to obj1");
        }

//        ObjectDemo obj1 = new ObjectDemo(34);

//        ObjectDemo obj1 = obj;

//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());

        System.out.println(obj1.getClass());
    }
}
