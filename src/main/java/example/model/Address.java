package example.model;

public class Address {
    private String fullName;
    private String street;
    private String city;
    private String country;
    private String phone;

    public Address(String fullName, String street, String city,
                   String country, String phone) {
        this.fullName = fullName;
        this.street   = street;
        this.city     = city;
        this.country  = country;
        this.phone    = phone;
    }

    public String getFullName() { return fullName; }
    public String getStreet()   { return street; }
    public String getCity()     { return city; }
    public String getCountry()  { return country; }
    public String getPhone()    { return phone; }

    @Override
    public String toString() {
        return String.format("%s | %s, %s, %s | 📞 %s",
                fullName, street, city, country, phone);
    }
}