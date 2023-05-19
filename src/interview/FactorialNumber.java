package interview;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5; // 1 * 2 * 3 * 4 * 5
        long factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int input = sc.nextInt();
        int i = 1;
        long factNum = 1;
        while (i <= input){
            factNum = factNum * i;
            i++;
        }
        System.out.println(factNum);
    }
}
