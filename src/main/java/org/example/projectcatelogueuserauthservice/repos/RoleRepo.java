package org.example.projectcatelogueuserauthservice.repos;

import org.example.projectcatelogueuserauthservice.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findRoleByValue(String nonAdmin);

    Optional<Role> findByValue(String admin);
}
