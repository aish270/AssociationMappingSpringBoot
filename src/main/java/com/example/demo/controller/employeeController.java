package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.employee;
import com.example.demo.repository.emprepo;

@RestController
public class employeeController {
	@Autowired
	private emprepo em;
	@PostMapping("/saveDetails")
	public String saveD(@RequestBody employee e) {
		em.save(e);
		return "saved";
	}
	
	

}
