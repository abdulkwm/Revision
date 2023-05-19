package interview;

public class CheckEqualityArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        int[] b = {1,2,3,4,5,6};
//        approach 1
//        boolean status = Arrays.equals(a,b);
//        if (status == true){
//            System.out.println("Array is equals");
//        }else {
//            System.out.println("Array is not equals");
//        }
//        approach 2
        boolean status1 = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    status1 = false;
                }
            }
        }else {
            status1 = false;
        }
        if (status1 == true){
            System.out.println("Array is equals");
        }else {
            System.out.println("Array is not equals");
        }
    }
}
