package pkg3;

public class ReversedNum {
    public int reversed(int num){
        int temp = 0;
        while (num > 0){
            temp = (temp * 10) + (num % 10);
            num = (int) Math.floor(num / 10);
        }
        return temp;
    }
    public static void main(String[] args) {
        ReversedNum rev = new ReversedNum();
        System.out.println(rev.reversed(12303762));
    }
}
