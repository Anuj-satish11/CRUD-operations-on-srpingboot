package com.crud.service;

import java.util.List;

import com.crud.entity.entity;


//all the methods are written in service class
public interface service {

	//fetching of data
	List<entity> getdata();
	
	//delete 
	void delete(int id);
	
	//inserts data by user entity class and making its variable
	entity insert(entity ent);
	
	//update data by user entity class and making its variable
	entity update(entity ent);
	
	entity one(int id);
		
	
}
