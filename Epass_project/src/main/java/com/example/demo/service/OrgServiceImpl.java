package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.OrganisationDAO;
import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Organisation;

public class OrgServiceImpl implements OrgService {

	@Autowired
	private OrganisationDAO orgdao;
	
	@Transactional
	@Override
	public List<Organisation> get() throws BusinessException {
		return orgdao.get();
	}

	@Override
	public Organisation getByName(String Name) throws BusinessException {
		Organisation org = orgdao.getByName(Name);
		return org;
	}

	@Override
	public void save(Organisation org) throws BusinessException {
		orgdao.save(org);
		
	}

	@Override
	public void delete(String Name) throws BusinessException {
		orgdao.delete(Name);
		
	}

}
