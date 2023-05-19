package interview;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
//        approach 1
        int l = 0;
        int h = a.length-1;
        int key = 8;
        boolean flag = false;
        while (l <= h){
            int m = (l+h)/2;
            if (a[m] == key){
                System.out.println("element found");
                flag = true;
                break;
            }
            if (a[m] < key){
                l = m + 1;
            }
            if (a[m] > key){
                h = m -1;
            }
        }
        if (flag == false){
            System.out.println("element is not found");
        }

//        approach 2
        System.out.println("***********************");
        int search = 9;
        int x = Arrays.binarySearch(a,search);
        if (x >= 0){
            System.out.println("element is found in index " + x);
        }else {
            System.out.println("element is not found");
        }
    }
}
