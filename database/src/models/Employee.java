package models;

public class Employee {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
    Boolean active;
    Boolean verified;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, String password, Boolean active, Boolean verified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }

    public Employee(String firstName, String lastName, String email, String password, Boolean active, Boolean verified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", verified=" + verified +
                '}';
    }
}
