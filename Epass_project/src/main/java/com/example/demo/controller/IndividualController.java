package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping(value="/delete/{Name}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Map<String, String>> delete(@PathVariable("Name") String Name) {
		Map<String, String> response=new HashMap<>();
		try {
			inservice.delete(Name);
			response.put("OK","Epass details got deleted");
			return ResponseEntity.accepted().body(response);
		} catch (BusinessException e) {			
			e.printStackTrace();
			response.put("error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
     }
}
		
		