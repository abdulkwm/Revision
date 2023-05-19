package interview;

public class FindingMiddleDigitInInteger {
    private static int middle(int num){
        String numString = String.valueOf(num);
        int size = numString.length();
        int middleIndex = (size - 1)/2;
        char charValue = numString.charAt(middleIndex);
        int middleDigit = Character.getNumericValue(charValue);
        return middleDigit;
    }
    public static void main(String[] args) {
        System.out.println(middle(25786));
    }
}
