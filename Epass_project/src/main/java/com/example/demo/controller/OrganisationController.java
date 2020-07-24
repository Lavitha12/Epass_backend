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
import com.example.demo.model.Organisation;
import com.example.demo.service.OrgService;

@RestController
@RequestMapping("/organisationdetails")
public class OrganisationController {

	@Autowired
	OrgService orgservice;
	
	@GetMapping("/organisation")
	public List<Organisation> get() throws BusinessException{	
		return orgservice.get();
	}
	
	@RequestMapping(value="/organisation/{Name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
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
	
	@PostMapping("/organisation")
	public Organisation save(@RequestBody Organisation orgobj) throws BusinessException
	{
		orgservice.save(orgobj);
		return orgobj;		
	}
	
	@PutMapping("/organisation")
	public Organisation update(@RequestBody Organisation orgobj) throws BusinessException {
		orgservice.save(orgobj);
		return orgobj;	
	}
	
	@RequestMapping(value="/organisation/{Name}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<Map<String, String>> delete(@PathVariable("Name") String Name) {
		Map<String, String> response=new HashMap<>();
		try {
			orgservice.delete(Name);
			response.put("OK","Epass details got deleted");
			return ResponseEntity.accepted().body(response);
		} catch (BusinessException e) {			
			e.printStackTrace();
			response.put("error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
     }

}
