package com.springprojectbatystag.demo.repositories;

import com.springprojectbatystag.demo.entities.Order;
import com.springprojectbatystag.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
