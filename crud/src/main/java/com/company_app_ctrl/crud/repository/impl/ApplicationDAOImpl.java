package com.company_app_ctrl.crud.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company_app_ctrl.crud.model.Application;
import com.company_app_ctrl.crud.repository.ApplicationDAO;
import com.company_app_ctrl.crud.util.ApplicationMapper;

@Repository
public class ApplicationDAOImpl implements ApplicationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Application obtenerApplicationById(int id) {
		String query = "SELECT * FROM application WHERE app_id = ?";
		return jdbcTemplate.queryForObject(query, new ApplicationMapper(), id);
	}

}
