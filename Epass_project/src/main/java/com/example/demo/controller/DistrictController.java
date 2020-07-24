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
import com.example.demo.model.District;
import com.example.demo.service.DistrictService;

@RestController
@RequestMapping("/districtdetails")
public class DistrictController {
	
	@Autowired
	DistrictService districtservice;
	
	@GetMapping("/district")
	public List<District> get() throws BusinessException{	
		return districtservice.get();
	}
	
	@PostMapping("/district")
	public District save(@RequestBody District districtobj) throws BusinessException
	{
		districtservice.save(districtobj);
		return districtobj;		
	}
	
//	@RequestMapping(value="/district/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	//public ResponseEntity<District> get
	//(@PathVaria
	//ble("id")int id)
//	{
//		District district = null;
//		try
//		{
//			district = districtservice.get(id);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		return ResponseEntity.accepted().body(district);
//	}
	
	@DeleteMapping("/district/{id}")
	public String delete(@PathVariable int id) throws BusinessException {
		districtservice.delete(id);
		return "Employee id: "+id+" is deleted.";	
	}
	
	@PutMapping("/district")
	public District update(@RequestBody District districtobj) throws BusinessException {
		districtservice.save(districtobj);
		return districtobj;	
	}
	
	@RequestMapping(value="/district/{district_name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<District> getByName(@PathVariable("district_name")String district_name)
	{
		District district = null;
		try
		{
			district = districtservice.getByName(district_name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(district == null)
		{
			throw new RuntimeException("District: "+district_name+" is not found.");
		}
		return ResponseEntity.accepted().body(district);
	}
}
