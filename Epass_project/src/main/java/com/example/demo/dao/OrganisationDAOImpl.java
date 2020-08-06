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
import com.example.demo.model.Organisation;

@Repository
public class OrganisationDAOImpl implements OrganisationDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public List<Organisation> get() throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Organisation> query = currentSession.createQuery("from Organisation",Organisation.class);
		List<Organisation> list = query.getResultList();
		return list;
	}

	@Transactional
	@Override
	public Organisation getByName(String Name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<Organisation> query=currentSession.createQuery("from Organisation where Name=:Name", Organisation.class);
		query.setParameter("Name", Name);
		Organisation org=(Organisation) query.getSingleResult();
		return org;
	}

	@Transactional
	@Override
	public void save(Organisation org) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(org);			
	}

	@Transactional
	@Override
	public void delete(String Name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		Organisation org= currentSession.get(Organisation.class,Name);
		currentSession.delete(org);
		
	}

}
