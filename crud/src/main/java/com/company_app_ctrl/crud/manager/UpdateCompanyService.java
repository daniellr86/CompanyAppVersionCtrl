package com.company_app_ctrl.crud.manager;

import com.company_app_ctrl.crud.model.dto.CompanyInDTO;

public interface UpdateCompanyService {
	
	void updateCompany(CompanyInDTO company, int id);

}
