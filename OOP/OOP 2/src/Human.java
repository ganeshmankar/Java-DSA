public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    //It is going to be common for all humans i.e objects thats why we use static word
    //Properties which are not related to objects and are common to all the objects of that class are static variables

    static void message(){
        System.out.println("Hello world!");
        //System.out.println(this.age); we cannot do this coz static is independent of any objects
        //In static we cannot use non static stuff
    }


    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married; //'this' refers the object
        Human.population += 1;
        //here we should use class name not 'this' keyword coz this variable is common to all human beings i.e objects

        Human.message();
    }
}
