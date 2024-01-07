import com.sun.tools.javac.Main;

public class StaticVariable {
    public static void main(String[] args) {
        Human Ganesh = new Human(20, "Ganesh", 600000, false);
        Human Devang = new Human(21, "Devang", 1000000, false);
        Human Rakesh = new Human(20, "Rakesh", 1200000, true);

        System.out.println(Ganesh.population);
        System.out.println(Devang.population);
        System.out.println(Rakesh.population);


        StaticVariable funnn = new StaticVariable();
        funnn.fun2();
    }

    //This is not dependent on objects
    //This does not belong to instance
    static void fun(){
//        greeting();
        // we cant do this if the greeting method is static coz in static main we can use only static methods
        //You can't use this coz it requires an instance
        //But the function you are using it in does not depend on instances

        //You cannot access non static stuff without referencing their instances in a static context
        //Hence, here i am referencing it
        StaticVariable obj = new StaticVariable();
        //Now we can use this
        obj.greeting();

    }

    //Somthing which is not static belongs to an object
    //This belongs to an instance
    void greeting(){
        System.out.println("Hello world");
    }

    //We are going to create an object for this in main
    void fun2(){
        greeting();
    }

}
