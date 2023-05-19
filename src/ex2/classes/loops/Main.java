package ex2.classes.loops;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //printing 1 - 10
//        for loop
        System.out.println("for loop");
        for (int i = 1; i < 11; i++) {
            if (i == 5 || i == 6) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("***********");
        //while loop
        int i = 1;
        System.out.println("while loop");
        while (i < 11) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        //do-while loop
        System.out.println();
        System.out.println("*************");
        int j = 1;
        System.out.println("do-while loop");
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 11);

        //ternary operator
        System.out.println();
        System.out.println("&&&&&&&&&&&&&&&&&");
        int rank = 3;
        String status = (rank == 1) ? "Done" : "Pending";
        System.out.println(status);

        //generating random number
        System.out.println("$$$$$$$$$$$");
//        random number between 4 to 15
        Random random = new Random();
//        (0,15-4)->[4,15] = (0,11)->[4,15]
//        for (i = 1; i <=10;i++) {
//            int rand = random.nextInt(12) + 4;
//            System.out.println(rand);
//        }
        System.out.println("%%%%%%%%%%");
//        random number between 9 to 17
//        [0,b-a)->[a,b] = [0,17-9)->[9,17]
        for (i = 1; i <= 10; i++) {
            int randNum = (int)Math.round (Math.random() * 8 + 9);
            System.out.println(randNum);
        }
    }

}
