package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Individual;

@Repository
public class IndividualDAOImpl implements IndividualDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Individual> get() throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Individual> query = currentSession.createQuery("from Individual",Individual.class);
		List<Individual> list = query.getResultList();
		return list;
	}

	@Transactional
	@Override
	public Individual getByName(String name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<Individual> query=currentSession.createQuery("from Individual where name=:name", Individual.class);
		query.setParameter("name", name);
		Individual d=(Individual) query.getSingleResult();
		return d;
	}

	@Transactional
	@Override
	public void save(Individual individual) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(individual);		
	}

	@Transactional
	@Override
	public void delete(int id) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);		
		Individual d = currentSession.get(Individual.class,id);
		currentSession.delete(d);		
	}

}
