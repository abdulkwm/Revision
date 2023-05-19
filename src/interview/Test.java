package interview;

public class Test {
    public static void main(String[] args) {
        //factorial
        int num = 5; //5*4*3*2*1
        int factorial = 1;
        int i = 1;
       while (i <= num){
           factorial = factorial * i;
           i++;
       }
        System.out.println(factorial);
    }
}
