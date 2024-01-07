public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "ObjectPrint{" + "num=" + num + '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(4);
        System.out.println(obj);
        //if the toString method is not defined then it will return random number using default/actual toString method of the object class
        //Its deciding this in  run time
    }
}
