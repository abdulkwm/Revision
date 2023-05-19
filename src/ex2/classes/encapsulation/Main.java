package ex2.classes.encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Abdu");
        obj1.setAge(2);
//        System.out.println(obj1.name);
//        System.out.println(obj1.age);
        System.out.println("**************");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}
