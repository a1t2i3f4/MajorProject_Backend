package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
}
