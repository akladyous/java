package com.practice.klass.todos;

public class User {
    private String email;
    private String password;
    private Boolean status;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.status = true;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                       "email='" + email + '\'' +
                       ", password='" + password + '\'' +
                       ", status=" + status +
                       '}';
    }
}
