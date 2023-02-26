package org.practice.services.users;

import org.practice.DAOs.users.UsersDAO;

public class UserServices {

    private UsersDAO userDAO = null;

    public UsersDAO getUserDAO() {
        this.userDAO = new UserDAOImplementation();
    }
}
