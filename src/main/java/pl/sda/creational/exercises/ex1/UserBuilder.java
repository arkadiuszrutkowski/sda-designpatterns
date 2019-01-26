package pl.sda.creational.exercises.ex1;

public class UserBuilder {

    private String firstName;
    private String lastName;
    private int birthYear;
    private String eMail;
    private String country;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public UserBuilder seteMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public UserBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public User build() {
        return new User(
                firstName,
                lastName,
                birthYear,
                eMail,
                country
        );
    }
}
