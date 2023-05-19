package interview;

public class CountCharOccurance {
    public static void main(String[] args) {
        String str = "Java Programming Java oops";
       int org =  str.length();
       String newStr = str.replace("a","");
       int newNum = newStr.length();
       System.out.println("number of " + "'a'" + " occurance is " + (org - newNum));
    }
}

