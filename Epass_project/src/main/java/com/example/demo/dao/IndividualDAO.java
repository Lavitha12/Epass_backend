package com.example.demo.dao;

import java.util.List;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;

public interface IndividualDAO {

	List<Individual> get() throws BusinessException;
	Individual getByName(String Name) throws BusinessException;
	void save(Individual individual) throws BusinessException;
	void delete(String Name) throws BusinessException;
}
