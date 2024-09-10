package com.company_app_ctrl.crud.manager;

import com.company_app_ctrl.crud.model.dto.CompanyOutDTO;
import com.company_app_ctrl.crud.model.dto.CompanyVersionAppOutDTO;

public interface SelectCompanyService {
	
	CompanyOutDTO consultaCompanyById(int id);
	CompanyVersionAppOutDTO consultaCompanyVersionAppByCompId(int id);

}
