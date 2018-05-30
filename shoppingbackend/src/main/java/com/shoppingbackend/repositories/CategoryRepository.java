package com.shoppingbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingbackend.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
