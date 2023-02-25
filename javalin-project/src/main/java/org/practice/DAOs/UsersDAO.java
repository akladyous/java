package org.practice.DAOs;

import org.practice.models.User;

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
    User createUser(User user) throws DAOsException;
    User getUser(int userID) throws DAOsException;
    User updateUser(User user) throws DAOsException;
    Boolean deleteUser(int id) throws DAOsException;


    /*
    update
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
