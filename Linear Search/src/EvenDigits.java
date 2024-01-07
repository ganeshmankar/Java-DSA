public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
//        System.out.println(findNumbers(arr));
        System.out.println(digits2(7485));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i : nums){
            if (even(i)){
                count++;
            }
        }


        return count;
    }

    static int digits2(int num){
        return(int)(Math.log10(num)) + 1;

    }
    // Function to check whether a number contains even digits or not
    static boolean even(int i){
        int noOfDigits = digits(i);
        /*
        if (noOfDigits % 2 == 0){
            return true;
        }return false;
         */
        return noOfDigits % 2 == 0;
    }
    // Count number of digits in a number
    static int digits(int i){

        if (i<0){
            i = i* -1;
        }

        if (i == 0){
            return 1;
        }


        int count = 0;
        while (i > 0){
            count++;
            i = i / 10;
        }
        return count;
    }

}

