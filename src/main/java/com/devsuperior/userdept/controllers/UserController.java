package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
		
		
	}
	@GetMapping(value = "/get/{id}")
	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
		
		
	}
	
	@PostMapping(value = "/post")
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
		
		
	}
	
	@PutMapping(value = "/put")
	public User atualizar(@RequestBody User user){
		User result = repository.saveAndFlush(user);
		return result;
		
		
	}
	

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
    repository.deleteById(id);
    
    
   
     
    
    	
    	
		
    }
    }
	
	






