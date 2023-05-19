package interview;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arrays = {4, 6, 3, 5, 9, 7, 2};
//        first approach
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                    flag = false;
                }
            }
        }
//        best approach
        for (int i  = 0; i < arrays.length; i++){
            for (int j = i + 1; j < arrays.length; j++){
                if (arrays[i] < arrays[j]){
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
//        printing the array
        System.out.println(Arrays.toString(arrays));
        for (int e : arrays) {
            System.out.print(e + " ");
        }
    }
}
