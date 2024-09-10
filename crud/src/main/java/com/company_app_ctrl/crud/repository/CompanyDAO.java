package com.company_app_ctrl.crud.repository;

import com.company_app_ctrl.crud.model.Company;

public interface CompanyDAO {
	
	int crear(Company company);
	int actualizar(Company company);
	Company obtenerCompanyPorId(int id);
	int borrarCompany(int company);
	Company obtenerNuevaCompany();
}
