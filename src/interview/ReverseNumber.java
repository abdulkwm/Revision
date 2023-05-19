package interview;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
//        int num = sc.nextInt();
//        int rev = 0;
//        while (num!=0){
//            rev = rev * 10 + num%10;
//            num = num/10;
//        }
//        System.out.println(rev);
//        System.out.println("Enter A Number:");
//        By using StringBuffer
        int x = sc.nextInt();
        StringBuffer sbf = new StringBuffer(String.valueOf(x));
        sbf.reverse();
        int revNum = Integer.parseInt(sbf.toString());
        System.out.println(revNum);
//        By using String Builder
        int num1 = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num1));
        sb.reverse();
        String str = sb.toString();
        int revNumber = Integer.parseInt(str);
        System.out.println(revNumber);
    }
}
