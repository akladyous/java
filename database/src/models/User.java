package models;

public class User {
    int id;
    String userName;
    String email;
    String password;
    Boolean active;
    Boolean verified;

    public User() {
    }

    public User(String userName, String email, String password, Boolean active, Boolean verified) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }

    public User(int id, String userName, String email, String password, Boolean active, Boolean verified) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.active = active;
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", verified=" + verified +
                '}';
    }
}
