package com.company_app_ctrl.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Version {

	private int id;
	private Application app;
	private String version;
	private String description;
}
