package ex1;

import java.util.Scanner;

public class NewDemo {
//    data member fields
    int personId;
    String firstName;
    String lastName;
    int age;
    String address;

    public NewDemo() {
        this.lastName = "mohammed";
        this.age = 113124;
        this.address = "Columbus";
    }

    public NewDemo(int personId, String firstName, String lastName, int age, String address) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "ex1.NewDemo{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        NewDemo obj = new NewDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the person Id");
        obj.setPersonId(sc.nextInt());
        System.out.println("please enter the person first Name");
        obj.setFirstName(sc.next());
        System.out.println("please enter person last Name");
        obj.setLastName(sc.next());
        System.out.println("please enter person age");
        obj.setAge(sc.nextInt());
        System.out.println("please enter person address");
        obj.setAddress(sc.next());
        sc.close();
        System.out.println("person detail : ");
        System.out.println(obj.toString());
    }
    }
