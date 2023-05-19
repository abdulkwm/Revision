package pkg3;

import java.util.Scanner;

public class Test {
    int num;
    String str;
    public Test(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public Test() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String myStr = sc.next();
        String reversed = reverseString(myStr);
        System.out.println("The reversed string is: " + reversed);

//        222222222

        Test obj1 = new Test(12,"Abdu");
        Test obj2 = new Test();
    }
    //Method take string parameter and check string is empty or not
    public static String reverseString(String myStr)
    {
        if (myStr.isEmpty()){
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}
