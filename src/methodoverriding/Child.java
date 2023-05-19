package methodoverriding;

public class Child extends Person{
    @Override
    public void behavior() {
        System.out.println("More love");
    }
}
