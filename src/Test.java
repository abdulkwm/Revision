import java.util.Arrays;

public class Test {
    public static void findNumber(int arr[],int x){
//        int l = 0, r = arr.length-1;
//        boolean flag = false;
//        while (l <= r) {
//            int m = (l+r)/2;
//            if (arr[m] == x) {
//                System.out.println("element found at index " + m);
//                flag = true;
//                break;
//            }
//            if (arr[m] < x) {
//                l = m + 1;
//            }else{
//                r = m -1;
//            }
//        }
//        if (flag == false){
//            System.out.println("element is not found");
//        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                flag = true;
                System.out.println("array is found at index " + i);
                break;
            }
        }
        if (!flag){
            System.out.println("element is not  found");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,3,4,5,6,7,8,43,6,31,9};
        System.out.println(Arrays.toString(a));
        int search = 43;
        int x = Arrays.binarySearch(a,search);
        if (x >= 0){
            System.out.println("element is found at index " + x);
        }else {
            System.out.println("element ius not found");
        }
        findNumber(a,8);
    }
}