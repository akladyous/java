package org.practice.DAOs.users;

import org.practice.DAOs.users.DAOsException;
import org.practice.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {

    enum Attributes {
        ID,
        first_name,
        last_name,
        email,
        password,
        active,
        verified
    }

    List<User> getAllUsers();
    User createUser(User user) ;
    User getUser(User user) ;
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
