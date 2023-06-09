package inheritance;

public class Person {
    int personId;
    String personName;
    Address address;

    public Person(int personId, String personName, Address address) {
        this.personId = personId;
        this.personName = personName;
        this.address = address;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
