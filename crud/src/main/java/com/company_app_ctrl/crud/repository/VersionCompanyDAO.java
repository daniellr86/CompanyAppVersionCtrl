package com.company_app_ctrl.crud.repository;

import com.company_app_ctrl.crud.model.VersionCompany;

public interface VersionCompanyDAO {

	VersionCompany obtenerVersionCompanyByCompId(int compId);
}
