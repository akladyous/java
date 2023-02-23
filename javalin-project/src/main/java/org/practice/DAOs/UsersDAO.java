package org.practice.DAOs;

import org.practice.models.User;

import java.util.List;

public interface UsersDAO {

    User createUser() throws DAOsException;
    User getUser() throws DAOsException;
    User updateUser() throws DAOsException;
    Boolean deleteUser() throws DAOsException;
    List<User> findAll() throws DAOsException;

}
