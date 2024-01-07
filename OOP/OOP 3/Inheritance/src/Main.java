public class Main {
    public static void main(String[] args) {
//        Box box = new Box(); //It will search the constructor which is not taking any argument
//        Box box1 = new Box(4);
//        System.out.println(box.l +" "+ box.h +" "+ box.w);
//        System.out.println(box1.l +" "+ box1.h +" "+ box1.w);

//        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.weight +" "+ box2.h);

//        BoxWeight box3 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.l +" "+ box3.h +" "+ box3.w +" "+ box3.weight);

//        Box box4 =  new BoxWeight(1,2,3,4);
//        System.out.println(box4.w); //We can only access the variables in Box class

        //There are many variables in parent and child classes
        //You are given access to variables in ref type which is BoxWeight
        //Hence u should have access to weight variable
        //This, also means that the once u r trying to access should be initialized
        //But here, when object itself is of the type parent class, how will u call the constructor of child class
        //Thats why error occured
        //You cannot have child as ref type and parent as object but vice versa its oky
//        BoxWeight box5 =  new Box(1,2,4);

//        BoxPrice box6 = new BoxPrice();
//        System.out.println(box6.cost);


        Box.greeting();

        //It will always run method in parent class only even if its override
        //You can;t override static methods but can be inherited
        Box box7 = new BoxWeight();
        box7.greeting();
        BoxWeight.greeting();

    }
}
