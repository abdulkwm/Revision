package pkg1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Address add = new Address();
        add.setStreetNo(12342);;
        add.setCityName("ohio");
        add.setStreetNo(123);

        p.setId(10001);
        p.setpName("Abdu");
        p.setAddress(add);

        System.out.println(p.getAddress().getHouseNo());
        System.out.println(p.getAddress().getCityName());
        System.out.println(p.getAddress().getStreetNo());

    }
}
