package interview;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"java", "c", "c++", "c", "python", "java"};
//        boolean flag = false;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[i] == arr[j]){
//                    System.out.println("duplicate is found at index " + i);
//                    flag = true;
//                }
//            }
//        }
//        if (!flag){
//            System.out.println("duplicate is not found");
//        }
        Set<String> stringSet = new HashSet<>();
        boolean flag = false;
        int index = 0;
        for (String str : arr){
            if (stringSet.add(str) == false){
                System.out.println("duplicate is found at index " + index);
                index++;
                flag = true;
            }
        }
        if (!flag){
            System.out.println("duplicate is not found");
        }
    }
}
