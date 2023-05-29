package interview;

import java.util.Arrays;

public class AnagramString {
    private static void anagramString(String input1, String input2){
        String s1 = input1.replace(" ", "");
        String s2 = input2.replace(" ", "");
        boolean status;
        if (s1.length() != s2.length()){
            status = false;
        }else {
            char[] charArray1 = s1.toLowerCase().toCharArray();
            char[] charArray2 = s2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            status = Arrays.equals(charArray1,charArray2);
        }
        if (status){
            System.out.println("Is Anagram");
        }else {
            System.out.println("Is Not Anagram");
        }
    }
    public static void main(String[] args) {
        anagramString("Abdu","badu");
    }
}
