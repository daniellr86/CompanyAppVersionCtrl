package com.company_app_ctrl.crud.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class CompanyOutDTO extends RespuestaDTO {

	private static final long serialVersionUID = -8899844538631506553L;
	
	private String codigo;
	private String name;
	private String description;

}
