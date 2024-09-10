package com.company_app_ctrl.crud.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company_app_ctrl.crud.manager.CreateCompanyService;
import com.company_app_ctrl.crud.model.Company;
import com.company_app_ctrl.crud.model.dto.CompanyInDTO;
import com.company_app_ctrl.crud.repository.CompanyDAO;

@Service
public class CreateCompanyServiceImpl implements CreateCompanyService {

	@Autowired
	private CompanyDAO companyDao;
	
	@Override
	public void creaCompany(CompanyInDTO company) {
		Company newCompany = new Company();
		newCompany.setCodigo(company.getCodigo());
		newCompany.setName(company.getName());
		newCompany.setDescription(company.getDescription());
		
		companyDao.crear(newCompany);
		
	}

}
