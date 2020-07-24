package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.District;


@Repository
public class DistrictDAOImpl implements DistrictDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<District> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<District> query = currentSession.createQuery("from District",District.class);
		List<District> list = query.getResultList();
		return list;
	}

	@Override
	public void save(District district) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(district);
	}

	@Override
	public District getByName(String district_name) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<District> query=currentSession.createQuery("from District where district_name=:district_name", District.class);
		query.setParameter("district_name", district_name);
		District d=(District) query.getSingleResult();
		return d;
	}

	@Override
	public void delete(int id) throws BusinessException {
		Session currentSession = entityManager.unwrap(Session.class);		
		District d = currentSession.get(District.class,id);
		currentSession.delete(d);		
	}



//	@Override
//	public District get(int id) throws BusinessException {
//		Session currentSession = entityManager.unwrap(Session.class);
//		TypedQuery<District> query =currentSession.createQuery("from Location where id=:id", District.class);
//		query.setParameter("id", id);
//		District d=(District) query.getSingleResult();
//		return d;
//	}
	
}
