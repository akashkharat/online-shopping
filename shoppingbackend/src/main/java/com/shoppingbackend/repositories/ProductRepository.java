package com.shoppingbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoppingbackend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(" select pr from Product pr where pr.category.id = ?1 order by id DESC")
	public List<Product> findByCategory(Integer categoryId);
}
