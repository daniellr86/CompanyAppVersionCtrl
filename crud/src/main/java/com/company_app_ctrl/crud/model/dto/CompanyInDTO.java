package com.company_app_ctrl.crud.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyInDTO implements Serializable {

	private static final long serialVersionUID = -8362368294891199213L;
	
	private String codigo;
	private String name;
	private String description;

}
