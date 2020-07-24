package com.example.demo.service;

import java.util.List;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.District;


public interface DistrictService {
	
	List<District> get() throws BusinessException;
	District getByName(String district_name) throws BusinessException;
	void save(District district) throws BusinessException;
	void delete(int id) throws BusinessException;
}
