package com.company_app_ctrl.crud.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company_app_ctrl.crud.model.Application;

public class ApplicationMapper implements RowMapper<Application> {

	@Override
	public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
		Application application = new Application();
		application.setId(rs.getInt("app_id"));
		application.setCode(rs.getString("app_code"));
		application.setName(rs.getString("app_name"));
		application.setDescription(rs.getString("app_description"));
		return application;
	}

}
