package org.practice.DAOs.users;

import org.practice.DAOs.users.DAOsException;
import org.practice.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {

    String tableName = "users";

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
    User createUser(User user) throws DAOsException, SQLException;
    User getUser(int userID) throws DAOsException;

    User update(User user) throws DAOsException;
    Boolean delete(int id) throws DAOsException;
    User save();
    // void validate();



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
