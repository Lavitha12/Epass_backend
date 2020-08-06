package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.DistrictDAO;
import com.example.demo.exceptions.BusinessException;
import com.example.demo.model.District;

@Service
public class DistrictServiceImpl implements DistrictService {
	
	@Autowired
	private DistrictDAO districtdao;

	
	@Override
	public List<District> get() throws BusinessException  {
		return districtdao.get();
	}	
	
	
	@Override
	public void save(District district) throws BusinessException {
		districtdao.save(district);		
	}

	
	@Override
	public District getByName(String district_name) throws BusinessException {
		District district = districtdao.getByName(district_name);
		return district;
	}

	
	@Override
	public void delete(int id) throws BusinessException {
		districtdao.delete(id);			
	}


//	@Transactional
//	@Override
//	public District get(int id) throws BusinessException {
//		District district = districtdao.get(id);
//		return district;
//	}

	
}
