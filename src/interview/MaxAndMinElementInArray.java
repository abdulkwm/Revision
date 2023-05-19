package interview;

public class MaxAndMinElementInArray {
    public static void main(String[] args) {
        int a[] = {50, 30, 40, 20, 60};
//        finding maximum number
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("maximum number is " + max);
//        finding minimum number
//        int a[] = {50, 30, 40, 20, 60};
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("minimum number is "+ min);
    }
}
