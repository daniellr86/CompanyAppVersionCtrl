package com.company_app_ctrl.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	
	private int id;
	private String codigo;
	private String name;
	private String description;

}
