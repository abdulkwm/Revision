package ex2.classes;

public class StaticKeywords {
    private int instanceVar;
    private static int staticVar;

    public StaticKeywords(int instanceVar) {
        this.instanceVar = instanceVar;
    }
    public void instanceMethod(){
        System.out.println("instance variable " + instanceVar);
        System.out.println("static variable " + staticVar);
    }
    public static void staticMethod(){
        System.out.println("static variable value " + staticVar);
    }
    public static void main(String[] args) {
        StaticKeywords obj1 = new StaticKeywords(2);
        StaticKeywords obj2 = new StaticKeywords(3);
        obj1.instanceMethod();
        obj2.instanceMethod();
        StaticKeywords.staticMethod();
        StaticKeywords.staticVar = 10;
        obj1.instanceMethod();
        obj2.instanceMethod();
        StaticKeywords.staticMethod();
    }
}
