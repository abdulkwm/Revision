package ex1;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
//        multidimensional arrays
        int[][] multi = new int[2][3];
        multi[0][0] = 1;
        multi[0][1] = 2;
        multi[0][2] = 3;
        multi[1][0] = 4;
        multi[1][1] = 5;
        multi[1][2] = 6;
        System.out.println();
        int[][] multi2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] i : multi){
            System.out.println(Arrays.toString(i));
            System.out.println(i.length);
        }
    }
}
