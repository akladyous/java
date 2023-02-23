package org.practice.services;

import org.practice.DAOs.DAOsException;
import org.practice.DAOs.UsersDAO;
import org.practice.models.User;

import java.util.List;

public class UserServices implements UsersDAO {

    public UserServices() {
        super();
    }

    @Override
    public User createUser() throws DAOsException {
        return null;
    }

    @Override
    public User getUser() throws DAOsException {
        return null;
    }

    @Override
    public User updateUser() throws DAOsException {
        return null;
    }

    @Override
    public Boolean deleteUser() throws DAOsException {
        return null;
    }

    @Override
    public List<User> findAll() throws DAOsException {
        return null;
    }
}
