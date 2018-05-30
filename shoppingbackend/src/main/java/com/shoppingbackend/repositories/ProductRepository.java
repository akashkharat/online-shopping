package com.shoppingbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingbackend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
