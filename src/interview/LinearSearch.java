package interview;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int search = 560;
        boolean flag = false;
        for (int i = 0; i < a.length; i++){
            if (search == a[i]){
                System.out.println("Element found " + a[i] + " in " + i + " index");
               flag = true;
            }
        }
        if (flag == false){
            System.out.println("Element Not found");
        }

//        search for String
        String[] arr = {"java", "c", "python", "html", "css"};
        String search2 = "java";
        boolean flag1 = false;
        for (int i = 0; i < arr.length; i++){
            if (search2.equals(arr[i])){
                System.out.println("Element is found " + arr[i] + " in index " + i);
                flag1 = true;
            }
        }
        if (flag1 == false){
            System.out.println("Element is not found");
        }
    }
}
