package org.example.projectcatelogueuserauthservice.services;

import org.example.projectcatelogueuserauthservice.models.User;

public interface IUserService {
    User getUserDetails(Long id);
}
