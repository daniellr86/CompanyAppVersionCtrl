package com.company_app_ctrl.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VersionCompany {

	private int id;
	private Company company;
	private Version version;
	private String description;
}
