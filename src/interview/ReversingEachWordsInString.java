package interview;

public class ReversingEachWordsInString {
    public static void main(String[] args) {
        String str = "Welcome To Java";
        String[] words = str.split("\\s");
        String reverse = "";
        for (String w : words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverse = reverse + sb.toString() + " ";
        }
        System.out.println(reverse);
    }
}
