package interview;

public class LargestPalindromeInString {
    private static String isPalindrome(String str){
        String[] strings = str.split(" ");
        String largestPalindrome = "";
        for (String word : strings) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (word.equalsIgnoreCase(reversedWord) && word.length() > largestPalindrome.length()) {
                largestPalindrome = word;
            }
        }
        return largestPalindrome;
    }
    //    private static String isPalindrome(String str){
//        String[] strings = str.split(" ");
//        String largestPalindrome = "";
//        for (int i = 0; i < strings.length; i++){
//            String reversed = new StringBuilder(strings[i]).reverse().toString();
//            if (strings[i].equalsIgnoreCase(reversed) && strings[i].length() > largestPalindrome.length()){
//                largestPalindrome = strings[i];
//            }
//        }
//        return largestPalindrome;
//    }
    public static void main(String[] args) {
        System.out.println( isPalindrome("This AZA ASSa is compleTEd"));
    }
}
