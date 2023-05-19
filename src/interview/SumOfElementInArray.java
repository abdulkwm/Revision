package interview;

public class SumOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 3};
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    approach 2 : using enhanced for loop
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
