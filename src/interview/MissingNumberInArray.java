package interview;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
//        array should not have duplicate
        int[] a = {1,2,5,6,7,8,9};
//        sum1 = 1+2+4+5 = 12;
//        sum2 = 1+2+3+4+5 = 15;
//        missingNum = sum2 - sum1 = 3

        int sum1 = 0;
        for (int i = 0; i < a.length; i++){
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of sum1 " + sum1);
        int sum2 = 0;
        for (int i = 1; i <= 9; i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of sum2 " + sum2);
//        missing number
        System.out.println("the missing num = " + (sum2-sum1));


        // finding  multiple missing item
//        Array should not have duplicates
        int[] arr = {1,2,2,4,5,7,7,9,11};
//        search between 1 to 12
        for (int i = 1; i < 12; i++){
            if (Arrays.binarySearch(arr,i) < 0){
                System.out.println(-i);
            }
        }


//        int[] b = {1,2,5,6,7,8,9};
////        multiple missing number in array
//        int [] register = new int[b.length];
//        for (int i : b){
//            register[i] = 1;
//        }
//        System.out.println("missing numbers in given array ");
//        for (int i = 1; i < register.length; i++){
//            if (register[i] == 0){
//                System.out.println(i);
//            }
//        }
    }
}
