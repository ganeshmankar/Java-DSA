public abstract class Parent {

    int age;
    final int value;

    public Parent(int age){
        this.age = age;
        value = 267467347;
    }

    static void hello(){
        System.out.println("Heyyy");
    }


    abstract void career ();
    abstract void partner ();

}
