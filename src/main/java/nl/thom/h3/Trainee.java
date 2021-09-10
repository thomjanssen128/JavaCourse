package nl.thom.h3;

public class Trainee {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Hello trainee: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Trainee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}


