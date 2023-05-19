package ex1;

public class Main {
    public static void main(String[] args) {
       String str = args[0];
       System.out.println("the length of string is : " + str.length());
       System.out.println(str.toUpperCase());
       StringBuilder sb = new StringBuilder(str);
       sb.reverse();
       String strRev = sb.toString();
       if (str.equals(strRev)){
           System.out.println("is palindrome");
       }else {
           System.out.println("is not palindrome");
       }
    }
}