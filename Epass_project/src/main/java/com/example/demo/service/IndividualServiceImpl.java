package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IndividualDAO;
import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;

public class IndividualServiceImpl implements IndividualService {

	@Autowired
	private IndividualDAO indao;
	
	@Transactional
	@Override
	public List<Individual> get() throws BusinessException {
		return indao.get();
	}

	@Transactional
	@Override
	public Individual getByName(String Name) throws BusinessException {
		Individual individual = indao.getByName(Name);
		return individual;
	}

	@Transactional
	@Override
	public void save(Individual individual) throws BusinessException {
		indao.save(individual);
		
	}

	@Transactional
	@Override
	public void delete(String Name) throws BusinessException {
		indao.delete(Name);		
	}
	
}