public class Fibonacchi {
    public static void main(String[] args) {
//        System.out.println(fibo(8));
//        System.out.println(fiboFormula(52));
        for (int i = 0; i < 5; i++) {
            System.out.print(fiboFormula(i)+" ");

        }
    }

    static int fiboFormula(int n){
//        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
        //We can remove les dominanting term
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }

    static int fibo(int n){
        //BASE CONDITION
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
