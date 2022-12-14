package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
