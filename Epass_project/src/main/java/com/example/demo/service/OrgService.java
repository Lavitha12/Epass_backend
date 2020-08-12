package com.example.demo.service;

import java.util.List;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Organisation;


public interface OrgService {
	
	List<Organisation> get() throws BusinessException;
	Organisation getByName(String Name) throws BusinessException;
	void save(Organisation org) throws BusinessException;
	void delete(int id) throws BusinessException;
}
