public class Circle extends Shapes {

    //This will run when the object of circle is created
    //Hence it's overriding the parent method

    @Override //Called Annotation used for checked purpose of being overriden
    void area(){
        System.out.println("Area is oie * r * r");
    }
}
