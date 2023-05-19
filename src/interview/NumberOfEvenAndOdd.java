package interview;

public class NumberOfEvenAndOdd {
    public static void main(String[] args) {
        int num = 145678;
        //even = 3 & odd = 3
        int even = 0;
        int odd = 0;
        int temp;
        while (num > 0){
            temp = num % 10;
            if (temp%2 == 0){
                even++;
            }else {
                odd++;
            }
            num = num / 10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
