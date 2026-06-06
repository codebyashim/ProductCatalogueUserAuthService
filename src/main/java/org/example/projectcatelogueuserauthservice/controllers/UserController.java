package org.example.projectcatelogueuserauthservice.controllers;

import org.example.projectcatelogueuserauthservice.dtos.UserDto;
import org.example.projectcatelogueuserauthservice.models.Role;
import org.example.projectcatelogueuserauthservice.models.User;
import org.example.projectcatelogueuserauthservice.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService service;

    @GetMapping("/{id}")
    public UserDto getUserDetails(@PathVariable Long id) {
        User user =service.getUserDetails(id);
        if (user != null) {
            return from(user);
        }
        return null;
    }

    private UserDto from(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        List<String> roles = user.getRoles().stream().map(Role::getValue).toList();
        dto.setRoles(roles);
        return dto;
    }
}
