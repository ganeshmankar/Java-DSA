public class Numbers {

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(1,2,3);
        num.sum(12,13);
    }
}
