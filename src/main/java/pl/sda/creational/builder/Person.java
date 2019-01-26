package pl.sda.creational.builder;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final String email;
    private final String address;
    private final String postalCode;

    public Person(
            String firstName,
            String lastName,
            int birthYear,
            String email,
            String address,
            String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
