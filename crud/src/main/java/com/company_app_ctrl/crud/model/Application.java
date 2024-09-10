package com.company_app_ctrl.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

	private int id;
	private String code;
	private String name;
	private String description;
}
