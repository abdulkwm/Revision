package interview;

public class SumOfNumberDigits {
    public static void main(String[] args) {
        int num = 12345;
        int org = num;
        int sum = 0;
        while (num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of the digits " + org + " is :" + sum);
    }
}
