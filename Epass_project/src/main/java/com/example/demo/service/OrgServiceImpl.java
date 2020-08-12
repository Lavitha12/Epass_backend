package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.OrganisationDAO;
import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.Organisation;

@Service
public class OrgServiceImpl implements OrgService {

	@Autowired
	private OrganisationDAO orgdao;
	
	
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
	public void delete(int id) throws BusinessException {
		orgdao.delete(id);				
	}

}
