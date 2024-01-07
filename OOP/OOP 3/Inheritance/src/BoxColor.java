public class BoxColor extends BoxWeight{

    String color;

    BoxColor(){
        super();
        this.color = "Blue";
    }

    BoxColor(BoxColor other){
        this.color = other.color;
    }

    BoxColor(double l, double h, double w, double weight, double cost,String color){
        super(l,h,w,weight);
        this.color = color;

    }
}
