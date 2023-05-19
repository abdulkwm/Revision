package ex2.classes;

public class OuterClass {
    private int num;
    private int num1 = 21;
    public void display1(){
        System.out.println("this is outer class number " + num1);
    }
    public class InnerClass {
        private int num2;
        public void display2(){
            num = 10;
            System.out.println("accessing of outer field " + num);
        }
    }

    public static void main(String[] args) {
//        outer class obj
        OuterClass outerClass = new OuterClass();
        outerClass.display1();
//        inner class obj
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display2();
    }
}
