package com.company_app_ctrl.crud.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company_app_ctrl.crud.model.Company;
import com.company_app_ctrl.crud.repository.CompanyDAO;
import com.company_app_ctrl.crud.util.CompanyMapper;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	private JdbcTemplate jdbcTempl;
	
	@Override
	public int crear(Company company) {
		String insertQuery = "INSET INTO company (codigo_company, name_company, description_company) VALUES(?, ?, ?)";
		return jdbcTempl.update(insertQuery, new Object[] {company.getCodigo(), company.getName(), company.getDescription()});
	}

	@Override
	public int actualizar(Company company) {
		String updateQuery = "UPDATE company SET codigo_company = ?, name_company = ?, description_company = ? WHERE id_company = ?;";
		return jdbcTempl.update(updateQuery, new Object[] {company.getCodigo(), company.getName(), company.getDescription(), company.getId()});
	}

	@Override
	public Company obtenerCompanyPorId(int id) {
		String query = "SELECT * FROM company WHERE id_company = ?";
		return jdbcTempl.queryForObject(query, new CompanyMapper(), id); 
	}

	@Override
	public int borrarCompany(int id) {
		String deleteQuery = "DELETE FROM company WHERE id_company = ?";
		return jdbcTempl.update(deleteQuery, id);
	}

	@Override
	public Company obtenerNuevaCompany() {
		String query = "SELECT TOP 1 * FROM company ORDER BY id_company DESC";
		return jdbcTempl.queryForObject(query, new CompanyMapper());
	}

}
