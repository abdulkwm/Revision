package interview;

import java.util.HashSet;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        String[] arr = {"java", "c", "c++", "c", "python", "java"};
//        approach 1
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("Found duplicate Element:" + arr[i]);
//                    flag = true;
//                }
//            }
//        }
//        if (flag == false) {
//            System.out.println("Duplicate is not found");
//        }
//        approach 2
//        String[] arr = {"java", "c", "c++", "c", "python", "java"};
        HashSet<String> lang = new HashSet<>();
        boolean flag1 = false;
        for (String l : arr){
            if (lang.add(l) == false){
                System.out.println("Duplicate found " + l);
                flag1 = true;
            }
        }
        if (flag1 == false){
            System.out.println("Duplicate is not found");
        }
    }
}
