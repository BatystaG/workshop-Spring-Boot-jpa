package com.springprojectbatystag.demo.repositories;

import com.springprojectbatystag.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
