import java.util.Arrays;

public class InnerClasses {
    static class Test{ //It should be static if its not then it will give error
        String name;
        public Test(String name){ //Constructor
            this.name = name;
        }

//        @Override
//        public String toString(){
//            return name;
//        }

    }
    public static void main(String[] args) {
        Test a = new Test("Ganesh");
        Test b = new Test("Saurabh");

//        Arrays.toString(new int[]{1,2,3,4});

        //try this by un-commenting above toString method
        System.out.println(a);
        //Internally this is calling a.toString but class where a belongs to does not contain toString
        //Hence it is going to use its own toString by-default one


        System.out.println(a.name);
        System.out.println(b.name);

    }
}
