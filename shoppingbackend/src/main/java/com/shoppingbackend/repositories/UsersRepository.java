package com.shoppingbackend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingbackend.entity.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
