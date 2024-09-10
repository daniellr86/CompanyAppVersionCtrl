package com.company_app_ctrl.crud.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company_app_ctrl.crud.model.Company;
import com.company_app_ctrl.crud.model.Version;
import com.company_app_ctrl.crud.model.VersionCompany;

public class VersionCompanyMapper implements RowMapper<VersionCompany> {

	@Override
	public VersionCompany mapRow(ResultSet rs, int rowNum) throws SQLException {
		VersionCompany verComp = new VersionCompany();
		verComp.setCompany(new Company());
		verComp.setVersion(new Version());
		verComp.setId(rs.getInt("version_company_id"));
		verComp.getCompany().setId(rs.getInt("company_id"));
		verComp.getVersion().setId(rs.getInt("version_id"));
		verComp.setDescription(rs.getString("version_company_description"));
		return verComp;
	}

}
