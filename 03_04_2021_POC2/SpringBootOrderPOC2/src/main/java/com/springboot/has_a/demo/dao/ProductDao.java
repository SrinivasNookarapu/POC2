package com.springboot.has_a.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.has_a.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
