package com.springprojectbatystag.demo.repositories;

import com.springprojectbatystag.demo.entities.Category;
import com.springprojectbatystag.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
