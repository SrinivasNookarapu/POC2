package com.springboot.has_a.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.has_a.demo.model.Order;
import com.springboot.has_a.demo.model.Product;
import com.springboot.has_a.demo.service.MainService;

@RestController
@RequestMapping("test")
public class OrderController {
	
	@Autowired
	private MainService service;
	

	
	@PostMapping("create")
	public Product create(@RequestBody Product product) {
		return service.create(product);
	}
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducte(Product product){
		return service.getAll(product);
		
	}
	@GetMapping("getProduct/{id}")
	public String getAllProducte(@PathVariable int id){
		return service.getById(id);
		
	}
	
	@PostMapping("createOrder")
	public Order create(@RequestBody Order order) {
		return service.create(order);
		
	}
	
	
	@GetMapping("getAllOrders")
	public List<Order> getAllOrders(Order order){
		return service.getAll(order);
		
	}
	
	@GetMapping("getOrder/{id}")
	public String getOrderById(@PathVariable int id){
		return service.getOrderById(id);
		
	}
	
	@PutMapping("getOrder/{id}/{quantity}")
	public String updateOrder(@PathVariable int id, @PathVariable double quantity) {
		return service.updateOrderById(id, quantity);
		
	}
	
	@PostMapping("place")
	public Order addPlaceOrder(@RequestParam("product_id") int product_id, @RequestParam("quantity") double quantity) {
		return service.addPlaceorder(product_id, quantity);
		
	}
	
	
	
	

}
