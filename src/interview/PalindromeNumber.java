package interview;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int origin = num;
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (origin == rev){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
    }
}
