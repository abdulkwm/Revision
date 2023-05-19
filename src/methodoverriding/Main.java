package methodoverriding;

public class Main {
    public static void main(String[] args) {
        Person p = new Child();
        p.behavior();
        p = new Colleague();
        p.behavior();
        p = new Parent();
        p.behavior();
        p = new Person();
        p.behavior();
    }
}
