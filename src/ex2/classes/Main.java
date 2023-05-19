package ex2.classes;

class SuperClassStatic {
    public static void lee() {
        System.out.println("Super class lee");
    }
}
class SubClass extends SuperClassStatic {
        public static void lee(){
            System.out.println("sub class foo");
    }
}
public class Main {
    public static void main(String[] args) {
        SuperClassStatic.lee();
        SubClass.lee();
    }
}
