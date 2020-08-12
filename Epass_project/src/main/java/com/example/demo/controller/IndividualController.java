package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;
import com.example.demo.service.IndividualService;

@RestController
@RequestMapping("/individual")
public class IndividualController 
{
	@Autowired
	IndividualService inservice;
	
	@GetMapping("/getallusers")
	public List<Individual> get() throws BusinessException{	
		return inservice.get();
	}
	
	@RequestMapping(value="/getbyname/{Name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Individual> getByName(@PathVariable("Name")String Name)
	{
		Individual individual = null;
		try
		{
			individual= inservice.getByName(Name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(individual == null)
		{
			throw new RuntimeException("Individual: "+Name+" is not found.");
		}
		return ResponseEntity.accepted().body(individual);
	}
	
	@PostMapping("/save")
	public Individual save(@RequestBody Individual inobj) throws BusinessException
	{
		inservice.save(inobj);
		return inobj;		
	}
	
	@PutMapping("/update")
	public Individual update(@RequestBody Individual inobj) throws BusinessException {
		inservice.save(inobj);
		return inobj;	
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) throws BusinessException {
		inservice.delete(id);
		return "Employee id: "+id+" is deleted.";	
	}
}
		
		