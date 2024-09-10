package com.company_app_ctrl.crud.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company_app_ctrl.crud.manager.SelectCompanyService;
import com.company_app_ctrl.crud.model.Application;
import com.company_app_ctrl.crud.model.Company;
import com.company_app_ctrl.crud.model.Version;
import com.company_app_ctrl.crud.model.VersionCompany;
import com.company_app_ctrl.crud.model.dto.CompanyOutDTO;
import com.company_app_ctrl.crud.model.dto.CompanyVersionAppOutDTO;
import com.company_app_ctrl.crud.repository.ApplicationDAO;
import com.company_app_ctrl.crud.repository.CompanyDAO;
import com.company_app_ctrl.crud.repository.VersionCompanyDAO;
import com.company_app_ctrl.crud.repository.VersionDAO;

@Service
public class SelectCompanyServiceImpl implements SelectCompanyService {

	@Autowired
	private CompanyDAO companyDao;
	
	@Autowired
	private ApplicationDAO applicationDao;
	
	@Autowired
	private VersionDAO versionDao;
	
	@Autowired
	private VersionCompanyDAO versionCompanyDAO;
	
	@Override
	public CompanyOutDTO consultaCompanyById(int id) {
		Company company = companyDao.obtenerCompanyPorId(id);
		return new CompanyOutDTO(company.getCodigo(), company.getName(), company.getDescription());
	}

	@Override
	public CompanyVersionAppOutDTO consultaCompanyVersionAppByCompId(int id) {
		Company company = companyDao.obtenerCompanyPorId(id);
		VersionCompany versionComp = versionCompanyDAO.obtenerVersionCompanyByCompId(id);
		Version version = versionDao.obtenerVersionById(versionComp.getVersion().getId());
		Application app = applicationDao.obtenerApplicationById(version.getApp().getId());
		return new CompanyVersionAppOutDTO(company.getCodigo(), company.getName(), app.getName(), version.getVersion());
	}

}
