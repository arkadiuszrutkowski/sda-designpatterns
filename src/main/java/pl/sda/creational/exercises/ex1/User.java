package pl.sda.creational.exercises.ex1;

public class User {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String eMail;
    private String country;

    public User(String firstName, String lastName, int birthYear, String eMail, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.eMail = eMail;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", eMail='" + eMail + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
