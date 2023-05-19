package interview;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,12,4,6,7,3,5};
//        for (int i=0; i < arr.length; i++){
//            if (arr[i] % 2 == 0){
//                System.out.println("even number " + arr[i]);
//            }else {
//                System.out.println("odd number " + arr[i]);
//            }
//        }
        for (int num : arr){
            if (num%2==0){
                System.out.println("even number " + num);
            }else {
                System.out.println("odd number " + num);
            }
        }
    }
}
