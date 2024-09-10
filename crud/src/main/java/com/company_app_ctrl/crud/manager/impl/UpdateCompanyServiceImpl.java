package com.company_app_ctrl.crud.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company_app_ctrl.crud.manager.UpdateCompanyService;
import com.company_app_ctrl.crud.model.Company;
import com.company_app_ctrl.crud.model.dto.CompanyInDTO;
import com.company_app_ctrl.crud.repository.CompanyDAO;

@Service
public class UpdateCompanyServiceImpl implements UpdateCompanyService {

	@Autowired
	private CompanyDAO companyDao;
	
	@Override
	public void updateCompany(CompanyInDTO companyInDto, int id) {
		Company company = companyDao.obtenerCompanyPorId(id);
		company.setCodigo(companyInDto.getCodigo());
		company.setName(companyInDto.getName());
		company.setDescription(companyInDto.getDescription());
		companyDao.actualizar(company);
	}
}
