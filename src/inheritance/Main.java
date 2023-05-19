package inheritance;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1001,"abdu",new Address(100,"newyork",12));
        System.out.println(p.address.display());
    }
}
