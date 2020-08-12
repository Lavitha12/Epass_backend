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
import com.example.demo.model.Organisation;
import com.example.demo.service.OrgService;

@RestController
@RequestMapping("/organisation")
public class OrganisationController {

	@Autowired
	OrgService orgservice;
	
	@GetMapping("/getallusers")
	public List<Organisation> get() throws BusinessException{	
		return orgservice.get();
	}
	
	@RequestMapping(value="/getbyname/{Name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Organisation> getByName(@PathVariable("Name")String Name)
	{
		Organisation org = null;
		try
		{
			org = orgservice.getByName(Name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(org == null)
		{
			throw new RuntimeException("Organisation: "+Name+" is not found.");
		}
		return ResponseEntity.accepted().body(org);
	}
	
	@PostMapping("/save")
	public Organisation save(@RequestBody Organisation orgobj) throws BusinessException
	{
		orgservice.save(orgobj);
		return orgobj;		
	}
	
	@PutMapping("/update")
	public Organisation update(@RequestBody Organisation orgobj) throws BusinessException {
		orgservice.save(orgobj);
		return orgobj;	
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) throws BusinessException {
		orgservice.delete(id);
		return "Employee id: "+id+" is deleted.";	
	}

}
