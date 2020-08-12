package com.example.demo.service;

import java.util.List;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;

public interface IndividualService {

	List<Individual> get() throws BusinessException;
	Individual getByName(String Name) throws BusinessException;
	void save(Individual individual) throws BusinessException;
	void delete(int id) throws BusinessException;
}
