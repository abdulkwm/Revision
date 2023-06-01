public class Test {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Original String is :" + str);
//        logic 1 . Using string concatenation
        String rev = "";
//        int len = str.length();
//        for (int i = len-1; i >= 0; i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reversed String is :" + rev);
//        logic 2 . using character array
//        char a[] = str.toCharArray();
//        for (int i = a.length - 1; i >= 0; i--){
//            rev = rev + a[i];
//        }
//        System.out.println("Reverse String is :" + rev);
////        logic 3 . By using Buffer class
//        StringBuffer sbf = new StringBuffer(str);
//        sbf.reverse();
//        System.out.println("Reversed String logic 3 :" + sbf);

//        logic 4. By using string Builder class
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String logic 4 :" + sb);
    }
}