package org.practice.services.users;

import org.practice.DAOs.users.UsersDAO;
import org.practice.models.User;

import java.util.List;

public class UserServices {

    private UsersDAO userDAO = null;

    public UserServices() {
        this.userDAO = new UserDAOImplementation();
    };

    public List<User> getAllUsers(){
        return this.userDAO.getAllUsers();
    }

    public User createUser(User user) {
        return this.userDAO.createUser(user);
    }

    public User getUser(User user) {
        return this.getUser(user);
    }

    public User updateUser(User user) {
        return this.userDAO.updateUser(user);
    }

    public Boolean deleteUser(int userID) {
        return this.userDAO.deleteUser(userID);
    }
}
