package interview;

public class Test {
    public static void main(String[] args) {
        String str =  "my name is abdu";
        int count = 1;
        for (int i = 0; i < str.length()-1; i++){
            if ((str.charAt(i)== ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        System.out.println("Number of Words in string is " + count);
    }
}
