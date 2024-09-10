package com.company_app_ctrl.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company_app_ctrl.crud.manager.CreateCompanyService;
import com.company_app_ctrl.crud.manager.DeleteCompanyService;
import com.company_app_ctrl.crud.manager.SelectCompanyService;
import com.company_app_ctrl.crud.manager.UpdateCompanyService;
import com.company_app_ctrl.crud.model.dto.CompanyInDTO;
import com.company_app_ctrl.crud.model.dto.CompanyVersionAppOutDTO;
import com.company_app_ctrl.crud.model.dto.RespuestaDTO;

@RestController
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private CreateCompanyService crearCompanyService;
	
	@Autowired
	private DeleteCompanyService borrarCompanyService;
	
	@Autowired
	private UpdateCompanyService actualizarCompanyService;
	
	@Autowired
	private SelectCompanyService consultaCompanyService;
	
	@PostMapping
	public ResponseEntity<RespuestaDTO> crearCompany(@RequestBody CompanyInDTO company) {
		crearCompanyService.creaCompany(company);
		return new ResponseEntity<RespuestaDTO>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<RespuestaDTO> borrarCompany(@PathVariable int id) {
		borrarCompanyService.borrarCompany(id);
		return new ResponseEntity<RespuestaDTO>(HttpStatus.OK);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<RespuestaDTO> actualizarCompany(@RequestBody CompanyInDTO company, @PathVariable int id) {
		actualizarCompanyService.updateCompany(company, id);
		return new ResponseEntity<RespuestaDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RespuestaDTO> consultarCompany(@PathVariable int id) {
		consultaCompanyService.consultaCompanyById(id);
		return new ResponseEntity<RespuestaDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/infoAppByComp/{id}")
	public ResponseEntity<RespuestaDTO> consultaInfoAppByCompany(@PathVariable int idComp) {
		CompanyVersionAppOutDTO infoCompApp = consultaCompanyService.consultaCompanyVersionAppByCompId(idComp);
		return new ResponseEntity<RespuestaDTO>(infoCompApp, HttpStatus.OK);
	}

}
