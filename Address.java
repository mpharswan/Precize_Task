public class Address {

    private String city;
    private String country;
    private int pincode;

    public Address(String city, String country, int pincode) {
        this.city = city;
        this.country = country;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
