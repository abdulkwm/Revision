package inheritance;

public class Address {
    int houseNo;
    String cityName;
    int streetNo;

    public int getHouseNo() {
        return houseNo;
    }

    public Address() {
    }

    public Address(int houseNo, String cityName, int streetNo) {
        this.houseNo = houseNo;
        this.cityName = cityName;
        this.streetNo = streetNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String display() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", cityName='" + cityName + '\'' +
                ", streetNo=" + streetNo +
                '}';
    }
}
