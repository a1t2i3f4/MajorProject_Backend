package com.example.demo.controller;

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

import com.example.demo.modal.Wmoney;
import com.example.demo.service.RegistrationService;
import com.example.demo.service.WmoneyService;



@RestController
@CrossOrigin
public class WmoneyController {
	@Autowired
	WmoneyService service;
	
	@Autowired
	// service object for joining table null value solution
	private RegistrationService uesrService;
	@GetMapping("/wmoney/{id}")
	public Wmoney getProduct(@PathVariable Long id) {
		return service.getWmoneyById(id);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getWmoney() {
		return ResponseEntity.ok(service.getAllWmoney());
	}
	@PostMapping("/add/{user_id}")
	public ResponseEntity<?> addMoney(@RequestBody Wmoney wmoney ,@PathVariable Long user_id) {
		wmoney.setUser(uesrService.getUserById(user_id));
		service.addMoney(wmoney);
		return new ResponseEntity<>("Money Added Successfully",HttpStatus.CREATED); 
	}
	 
	
	@PutMapping("/updatewallet/{id}")
	public ResponseEntity<?> updateWmoney(@PathVariable Long id,@RequestBody Wmoney emp) {
		service.updateWmoney(id, emp);
		return new ResponseEntity<>("Wmoney Updated Successfully",HttpStatus.NO_CONTENT); 
	}

}