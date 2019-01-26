package pl.sda.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Person person = new Person(
                "John",
                "Doe",
                1980,
                "john@mail.com",
                "Bryant Street",
                "15-001"
        );
        System.out.println(person.toString());

        PersonBuilder builder = new PersonBuilder();
        builder.setFirstName("Jan");
        builder.setLastName("Kowalski");
        builder.setEmail("jan.kowalski@mail.com");
        builder.setPostalCode("15-002");
        Person builtPerson = builder.build();
        System.out.println(builtPerson.toString());
    }
}
