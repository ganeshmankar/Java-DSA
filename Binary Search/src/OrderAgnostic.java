public class OrderAgnostic { //Agnostic means its sorted but don't know in which order
    public static void main(String[] args) {
        int[] arr = {-13, -4, 3, 9, 21, 29, 44};
        checkSortType(arr);
    }

    static void checkSortType(int[] arr){
        if(arr[0] >= arr[arr.length-1]){
            System.out.println("Its in Descending Order");
        }
        else if(arr[0] <= arr[arr.length-1]){
            System.out.println("Its in Ascending Order");
        }
    }
}
