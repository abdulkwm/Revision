package methodoverriding;

public class Colleague extends Person{
    @Override
    public void behavior() {
        System.out.println("professional");
    }
}
