package java8;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<String, Integer> integerFunction = s -> s.length();
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println("Length of String: " + integerFunction.apply(str));
    }
}
