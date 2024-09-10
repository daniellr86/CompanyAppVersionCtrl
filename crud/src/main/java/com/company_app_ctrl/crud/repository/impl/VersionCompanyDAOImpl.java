package com.company_app_ctrl.crud.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company_app_ctrl.crud.model.VersionCompany;
import com.company_app_ctrl.crud.repository.VersionCompanyDAO;
import com.company_app_ctrl.crud.util.VersionCompanyMapper;

@Repository
public class VersionCompanyDAOImpl implements VersionCompanyDAO {

	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Override
	public VersionCompany obtenerVersionCompanyByCompId(int compId) {
		String query = "SELECT * FROM version_company WHERE company_id = ?";
		return jdbcTemp.queryForObject(query, new VersionCompanyMapper(), compId);
	}

}
