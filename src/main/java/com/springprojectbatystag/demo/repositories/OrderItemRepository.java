package com.springprojectbatystag.demo.repositories;

import com.springprojectbatystag.demo.entities.OrderItem;
import com.springprojectbatystag.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
