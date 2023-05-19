package interview;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping values are..." + a + " " + b);
//    Logic1 with using third variable
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("1.After swapping values are..." + a + " " + b);

////        Logic 2 without using third variable use + & -
//        System.out.println("*************");
//        a = a + b; //10+20 = 30
//        b = a - b; //30-20 = 10
//        a = a - b; //30-10 = 20
//        System.out.println("2.After swapping values are..." + a + " " + b);

//        Logic 3 without using third variable use * & /
        System.out.println("**************");
        a = a * b; //10 * 20 = 200
        b = a / b; //200 / 20 = 10
        a = a / b; //200 / 10 = 20
        System.out.println("3.After swapping values are..." + a + " " + b);
    }
}
