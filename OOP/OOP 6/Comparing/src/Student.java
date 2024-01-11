public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno +"-"+ marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("We are in compreTo method!!");
        int diff = (int)(this.marks - o.marks);

        //If diff is 0 means both equal
        //If diff<1 means o is bigger else o is smaller
        return diff;
    }
}
