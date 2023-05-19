package interview;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
//        Approach 1 Random class
//        generate random number from 5 to 8
        Random random = new Random();
        int rand = random.nextInt(4) + 5;
        System.out.println(rand);
//        Approach 2 Math.random()
        int randNum = (int) Math.floor ((Math.random() * 3 + 5));
        System.out.println(randNum);
//        Approach 3 Apache commons-lang API

    }
}
