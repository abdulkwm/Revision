package ex2.classes.loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            case 2:
            case 10:
            case 12:
                System.out.println("you enter " + choice);
                break;
            default:
                System.out.println("you enter number " + choice + " that is default value!");
        }
    }
}
