package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Order;
import com.example.demo.service.OrderService;


@RestController 
@CrossOrigin
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/getorder/{id}")
	public Order getOrder(@PathVariable Long userid) {
		return service.getOrderById(userid);
	}

	@GetMapping("/getorder")
	public List<Order> getOrders() {
		return service.getOrder();
	}
	@PostMapping("/order")
	public ResponseEntity<?> createOrder(@RequestBody Order emp) {
		service.createOrder(emp);
		return new ResponseEntity<>("order placed Successfully",HttpStatus.CREATED); 
	}
}
