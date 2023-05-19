package ex1;

public class Test {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,15};
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        for (int i : arr){
            System.out.print(i + " ");
        }
            System.out.println();
        System.out.println("my first number was " + num1);
        System.out.println("my second number was " + num2);
        boolean found1 = true;
        boolean found2 = true;
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == num1){
                found1 = true;
            }else if (arr[i] == num2){
                found2 = true;
            }
        }
        if (found1 && found2) {
            System.out.println("It's BINGO");
        }else {
            System.out.println("Try Again");
        }
    }
}
