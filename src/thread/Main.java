package thread;
public class Main {
    public static void main(String[] args) throws InterruptedException{
//        Thread myThread = new MyThread();
//        myThread.start();
//
//        Thread.sleep(2000);
//        myThread.interrupt();
//
//        myThread.join();
//        System.out.println("Main Thread Finished");
        Countdown countdown = new Countdown();
        CountDownThread t1 = new CountDownThread(countdown);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countdown);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread Started");
            Thread.sleep(3000);
            System.out.println("Thread Finished");
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
    }
}
class Countdown {
    private int i;
    public void doCountDown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANS_BLUE;
                break;
            case "Thread 2":
                color = ThreadColor.ANS_GREEN;
                break;
            case "Thread 3":
                color = ThreadColor.ANS_RED;
                break;
            default:
                color = ThreadColor.ANS_YELLOW;
        }
        for (i = 1; i < 10; i++){
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }
}
class CountDownThread extends Thread {
    private Countdown threadCountdown;
    public CountDownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountDown();
    }
}
