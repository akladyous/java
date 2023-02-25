package org.practice.DAOs.users;

import org.practice.DAOs.users.DAOsException;
import org.practice.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {

    List<User> getAllUsers();
    User createUser(User user) ;
    User getUser(int userID) ;
    User updateUser(User user) ;
    Boolean deleteUser(User userID) ;

    /*
    destroy
    update
    save

    class methods
        create
        .all
        find
        destroy
        find
    */
}
