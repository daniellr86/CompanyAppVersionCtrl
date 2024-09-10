package com.company_app_ctrl.crud.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company_app_ctrl.crud.model.Company;

public class CompanyMapper implements RowMapper<Company> {

	@Override
	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		Company company = new Company();
		company.setId(rs.getInt("id_company"));
		company.setCodigo(rs.getString("codigo_company"));
		company.setName(rs.getString("name_company"));
		company.setDescription(rs.getString("description_company"));
		return company;
	}

}
