package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;


public class IndividualDAOImpl implements IndividualDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Individual> get() throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Individual> query = currentSession.createQuery("from Individual",Individual.class);
		List<Individual> list = query.getResultList();
		return list;
	}

	@Override
	public Individual getByName(String Name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<Individual> query=currentSession.createQuery("from Individual where Name=:Name", Individual.class);
		query.setParameter("Name", Name);
		Individual d=(Individual) query.getSingleResult();
		return d;
	}

	@Override
	public void save(Individual individual) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(individual);		
	}

	@Override
	public void delete(String Name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		Individual in= currentSession.get(Individual.class,Name);
		currentSession.delete(in);
		
	}

}
