package com.example.jwt.repository;

import com.example.jwt.models.ERole;
import com.example.jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 2/27/22
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
