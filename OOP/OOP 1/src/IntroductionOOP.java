
import java.util.ArrayList;
import java.util.Arrays;

public class IntroductionOOP {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // just declaring
//        Student Ganesh;
//        Ganesh = new Student();

        Student ganesh = new Student(15, "Ganesh Mankar", 85.4f);
        Student saurabh = new Student(18, "Saurabh Sapkal", 90.3f);

//        kunal.rno = 13;
//        kunal.name = "Ganesh Mankar";
//        kunal.marks = 88.5f;


//        kunal.changeName("Shoe lover");
//        kunal.greeting();

//
        System.out.println(ganesh.rno);
        System.out.println(ganesh.name);
        System.out.println(ganesh.marks);

        Student random = new Student(ganesh);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student rakesh = new Student(17, "Rakesh Oza", 89.7f);
    // here, this will be replaced with rakesh
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}

