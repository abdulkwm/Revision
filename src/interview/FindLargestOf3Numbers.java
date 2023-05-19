package interview;

import java.util.Scanner;

public class FindLargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
//		logic 1
        if (a == b && b == c) {
            System.out.println("All are Equals");
        } else {
//      int first = Math.max(a,b);
            int large = Math.max(c, Math.max(a,b));
            System.out.println("The larger number is " + large);
        }
    }
}
