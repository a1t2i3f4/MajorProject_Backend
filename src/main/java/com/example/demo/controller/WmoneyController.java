package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Wmoney;
import com.example.service.WmoneyService;



@RestController
@CrossOrigin
public class WmoneyController {
	@Autowired
	WmoneyService service;
	
	@GetMapping("/wmoney/{id}")
	public Wmoney getProduct(@PathVariable Long id) {
		return service.getWmoneyById(id);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getWmoney() {
		return ResponseEntity.ok(service.getAllWmoney());
	}
	@PostMapping("/add")
	public ResponseEntity<?> addMoney(@RequestBody Wmoney emp) {
		service.addMoney(emp);
		//System.out.println(service.addMoney(emp));
		return new ResponseEntity<>("Money Added Successfully",HttpStatus.CREATED); 
	}
	 
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateWmoney(@PathVariable Long id,@RequestBody Wmoney emp) {
		service.updateWmoney(id, emp);
		return new ResponseEntity<>("Wmoney Updated Successfully",HttpStatus.NO_CONTENT); 
	}

}
