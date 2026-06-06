package org.example.projectcatelogueuserauthservice.services;

import org.example.projectcatelogueuserauthservice.models.User;
import org.example.projectcatelogueuserauthservice.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo repo;

    @Override
    public User getUserDetails(Long id) {
        return repo.findById(id).orElse(null);
    }
}
