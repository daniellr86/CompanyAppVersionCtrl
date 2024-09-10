package com.company_app_ctrl.crud.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company_app_ctrl.crud.manager.DeleteCompanyService;
import com.company_app_ctrl.crud.repository.CompanyDAO;

@Service
public class DeleteCompanyServiceImpl implements DeleteCompanyService {

	@Autowired
	private CompanyDAO companyDao;
	
	@Override
	public void borrarCompany(int id) {
		companyDao.borrarCompany(id);
	}

}
