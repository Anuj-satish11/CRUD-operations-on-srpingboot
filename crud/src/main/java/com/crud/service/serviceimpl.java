package com.crud.service;
import com.crud.repository.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.entity;


//you add the method in service interface calss and the next is just hower into serviceimpl and press "add unimplemented method

@Service
public class serviceimpl implements service{

	//repository has jpa modules which has many functions. To get all the functions of jpa module we make an object out of it.
	//Autowired is the annotation used to help in loose coupling
	@Autowired
	private repo r;
	
	//you need to print all the data present which you can do using list as it has unbounded size
	@Override
	public List<entity> getdata() {
		
		return r.findAll();
	}
	
	//you delete by passing the int id
	@Override
	public void delete(int id) {
		
		r.deleteById(id);
	}

	//you insert a data by taking entity ent as a argument.
	//entity is like a table which you defined in entity class
	//the retrun time is also entity as you return what to save to the function of repository jpa (r.save(ent))
	@Override
	public entity insert(entity ent) {
		
		return r.save(ent);
	}

	//same like the above
	@Override
	public entity update(entity ent) {
	
		return r.save(ent);
	}

	//now this helps in getting data of specified id
	@Override
	public entity one(int id) {
		
		Optional<entity> ew=r.findById(id);
		if(ew.isPresent())
		{
			return ew.get();
		}
		throw new RuntimeException("hello baby "+id);
	}

	
	
}
