package com.springboot.has_a.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.has_a.demo.dao.OrderDao;
import com.springboot.has_a.demo.dao.ProductDao;

import com.springboot.has_a.demo.model.Order;
import com.springboot.has_a.demo.model.Product;

@Service
public class MainService {
	
	@Autowired
	private ProductDao productRepo;
	
	
	
	public Product create(Product product) {
		return productRepo.save(product);
		
	}
	
	@Autowired
	private OrderDao orderRepo;
	
	private Order order_data;
	
	public Order create(Order order) {
		return orderRepo.save(order);
		
	}
	
	public List<Product> getAll(Product product) {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
	public List<Order> getAll(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}
	
	// Get Product By Id
	public String getById(int id) {
		String msg = "";
		Optional<Product> list = productRepo.findById(id);
		if(list.isPresent()) {
			msg = "Success";
		}
		else {
			msg = "product Doesn't Exist";
		}
		return msg+"\r"+list.toString();
	}
	
	// Get Order By Id
	public String getOrderById(int id) {
		String msg = "";
		Optional<Order> list = orderRepo.findById(id);
		if(list.isPresent()) {
			msg = "Success";
		}
		else {
			msg = "Order Doesn't Exist";
		}
		return msg+ "\r" +list.toString();
	}
	
	// Update By Id
	public String updateOrderById(int id, double quantity) {
		String msg = "";
		Optional<Order> check = orderRepo.findById(id);
		
		if(check.isPresent()) {
		 order_data = orderRepo.findById(id).orElse(new Order());
		 order_data.setQuantity(quantity);
     	msg = "Success";
		}
		else {
			msg = "Order Id Doesn't  Exist"; 
		}
		
		return msg+ "\r" +orderRepo.save(order_data);
	}

	public Order addPlaceorder(int product_id, double quantity) {
		
		Optional<Product> product = productRepo.findById(product_id);
		
		if(product.isPresent()) {
			order_data.setQuantity(quantity);
		}
		
		
		
		return orderRepo.save(order_data);
	}
	
	

}
