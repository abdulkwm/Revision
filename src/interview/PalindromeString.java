package interview;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String org = sc.next();
//        String rev = "";
//        int num = org.length();
//        for (int i = num - 1; i >= 0; i--){
//            rev = rev+org.charAt(i);
//        } (org.equals(rev)){
//           System.out.println("Is Palindrome");
//       }else {
//           System.out.println("Is Not Palindrome");
//       }
//        using stringBuffer
        StringBuffer sbf = new StringBuffer(org);
        sbf.reverse();
        String rev = sbf.toString();
        if (rev.equals(org)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Is Not Palindrome");
        }
//        using string builder
        StringBuilder sb = new StringBuilder(org);
        sb.reverse();
        String revStr = sb.toString();
        if (revStr.equals(org)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Is Not Palindrome");
        }
    }
}
