package com.company_app_ctrl.crud.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company_app_ctrl.crud.model.Version;
import com.company_app_ctrl.crud.repository.VersionDAO;
import com.company_app_ctrl.crud.util.VersionMapper;

@Repository
public class VersionDAOImpl implements VersionDAO {

	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Override
	public Version obtenerVersionById(int id) {
		String query = "SELECT * FROM version WHERE version_id = ?";
		return jdbcTemp.queryForObject(query, new VersionMapper(), id);
	}

}
