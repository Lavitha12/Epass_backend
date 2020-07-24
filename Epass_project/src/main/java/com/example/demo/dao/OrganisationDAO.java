package com.example.demo.dao;

import java.util.List;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Organisation;

public interface OrganisationDAO {

	List<Organisation> get() throws BusinessException;
	Organisation getByName(String Name) throws BusinessException;
	void save(Organisation org) throws BusinessException;
	void delete(String Name) throws BusinessException;
}
