package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Order;
import com.example.demo.repo.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public Order getOrderById(Long id) {
		try {
			Order order = this.repo.findById(id).get();
			return order;
		}catch(Exception e) {
			return null;
		}
	}

	public List<Order> getOrder() {return (List<Order>) this.repo.findAll();}

	public Order createOrder(Order order) {
		this.repo.save(order);
		return order;
	}

}
