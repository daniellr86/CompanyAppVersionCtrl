package com.company_app_ctrl.crud.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class CompanyVersionAppOutDTO extends RespuestaDTO {

	private static final long serialVersionUID = 5161074583248477818L;
	
	private String codigoCompany;
	private String nameCompany;
	private String appName;
	private String version;

}
