public class BoxWeight extends Box{
    double weight;

//    @Override
    static void greeting(){
        System.out.println("Hey, im in BoxWeight class");
    }


    public BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        this.weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); //Call the parent class constructor
        //Used to initialize the values in parent class
        //try ctrl+click on super to check which constructor its calling

        this.weight = weight;
    }
}

