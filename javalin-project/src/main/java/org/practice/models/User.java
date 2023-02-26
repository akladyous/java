package org.practice.models;

import org.practice.services.users.UserDAOImplementation;

import java.util.Objects;

public class User extends UserDAOImplementation {
    private Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    private Boolean active = true;
    private Boolean verified = false;


    public static enum Attributes {
        ID,
        first_name,
        last_name,
        email,
        password,
        active,
        verified
    }

    public User() {};

    public User(Integer id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }
    public Boolean getActive() {
        return active;
    }
    public Boolean getVerified() {return verified;}

    public void setId(Integer id) {
        this.id = id;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "User{" +
                       "id=" + id +
                       ", firstName='" + firstName + '\'' +
                       ", lastName='" + lastName + '\'' +
                       ", email='" + email + '\'' +
                       ", password='" + password + '\'' +
                       ", active=" + active +
                       ", verified=" + verified +
                       '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(id, user.id)) return false;
        if (!Objects.equals(firstName, user.firstName))
            return false;
        if (!Objects.equals(lastName, user.lastName))
            return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(password, user.password))
            return false;
        if (!Objects.equals(active, user.active)) return false;
        return Objects.equals(verified, user.verified);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (verified != null ? verified.hashCode() : 0);
        return result;
    }
}
