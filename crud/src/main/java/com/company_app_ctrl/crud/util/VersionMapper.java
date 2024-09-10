package com.company_app_ctrl.crud.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.company_app_ctrl.crud.model.Application;
import com.company_app_ctrl.crud.model.Version;

public class VersionMapper implements RowMapper<Version>{

	@Override
	public Version mapRow(ResultSet rs, int rowNum) throws SQLException {
		Version version = new Version();
		version.setId(rs.getInt("version_id"));
		version.setApp(new Application());
		version.getApp().setId(rs.getInt("app_id"));
		version.setVersion(rs.getString("version"));
		version.setDescription(rs.getString("version_description"));
		return version;
	}
	

}
