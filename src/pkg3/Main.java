package pkg3;

public class Main {
    public static void main(String[] args) {
//        generate number between 2-8
//        method 1
//        Random random = new Random();
//        for (int i = 1; i < 6;i++){
//        int randNum = random.nextInt(7)+2;
//            System.out.println(randNum + " i:" + i);
//        }
//        method 2
        for (int i = 1; i<10; i++){
            int randNum = (int) Math.floor(Math.random()* 6 + 3);
            System.out.println(randNum + " i:" + i);
        }
    }
}
