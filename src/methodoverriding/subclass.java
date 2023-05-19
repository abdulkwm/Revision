package methodoverriding;

class superclass {
    public void displayResult() {
        System.out.println("Printing from methodoverriding.superclass");
    }
}
public class subclass extends superclass {
    public void displayResult() {
        System.out.println("Displaying from subClass");
        super.displayResult();
    }
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.displayResult();
    }
}