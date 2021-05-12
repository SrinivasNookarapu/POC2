package com.springboot.has_a.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.has_a.demo.model.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

}
