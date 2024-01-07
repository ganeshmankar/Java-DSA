public class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey, im in Box class");
    }

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){

        //super(); Object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box...");
    }
}
