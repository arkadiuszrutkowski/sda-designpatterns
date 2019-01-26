package pl.sda.creational.builder;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int birthYear = 1980;
    private String email;
    private String address = "Bryant Street";
    private String postalCode = "15-001";

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Person build() {
        return new Person(
                firstName,
                lastName,
                birthYear,
                email,
                address,
                postalCode
        );
    }
}
