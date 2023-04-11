package com.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.entity;
import com.crud.service.service;


//the API is called from controller class. the controller analyzes the request and calls the  required method from the service class
@RestController
public class controller {

	
	
	@Autowired
	private service s;
	
	@GetMapping("/hello")
	public String hello()
		{
			return "hello world";
		}
	
	@GetMapping("/get")
	public List<entity> get(){
		return s.getdata();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id){
		s.delete(id);
	}
	
	
	@PostMapping("/insert")
	public entity save(@RequestBody entity ent) {
		return s.insert(ent);
	}
	
	
	@PutMapping("/update/{id}")
	public entity update(@PathVariable int id,@RequestBody entity ent)
	{
		ent.setId(id);
		return s.update(ent);
	}
	
	@GetMapping("/get/{id}")
	public entity one(@PathVariable int id) {
		return s.one(id);
	}
	
	
	
	
}
