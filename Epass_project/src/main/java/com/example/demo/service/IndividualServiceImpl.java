package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.IndividualDAO;
import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;

@Service
public class IndividualServiceImpl implements IndividualService {

	@Autowired
	private IndividualDAO indao;
	
	
	@Override
	public List<Individual> get() throws BusinessException {
		return indao.get();
	}

	
	@Override
	public Individual getByName(String Name) throws BusinessException {
		Individual individual = indao.getByName(Name);
		return individual;
	}

	
	@Override
	public void save(Individual individual) throws BusinessException {
		indao.save(individual);
		
	}


	@Override
	public void delete(int id) throws BusinessException {
		indao.delete(id);
		
	}
	
}
