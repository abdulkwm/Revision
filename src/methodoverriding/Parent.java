package methodoverriding;

public class Parent extends Person{
    @Override
    public void behavior() {
        System.out.println("Have more respect");
    }
}
