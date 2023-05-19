package ex2.classes.loops;

public class InfiniteLoop {
    public static void main(String[] args) {
        System.out.println("for infinite loop");
        int count = 0;
        for (;;){
            count++;
            if (count > 3) {
                break;
            }
            System.out.println("******************");
        }
        System.out.println("while infinite loop");
        int num = 0;
        while (true){
            num++;
            System.out.println("#########");
            if (num > 5){
                break;
            }
        }
        System.out.println("do-while infinite loop");
        int cnt = 0;
        do {
            System.out.println("@@@@@@@@@@@");
            cnt++;
            if (cnt > 4){
                break;
            }
        }while (true);
    }
}
