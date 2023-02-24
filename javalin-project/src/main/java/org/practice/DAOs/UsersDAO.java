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

    User createUser() throws DAOsException;
    User getUser() throws DAOsException;
    User updateUser() throws DAOsException;
    Boolean deleteUser() throws DAOsException;
    List<User> findAll() throws DAOsException;

}
