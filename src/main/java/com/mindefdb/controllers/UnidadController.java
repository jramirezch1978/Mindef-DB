package com.mindefdb.controllers;

import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindefdb.dtos.UnidadDTO;
import com.mindefdb.services.IUnidadService;

@RestController
@RequestMapping("api/unidad")
public class UnidadController {
	
	@Autowired 
	private IUnidadService unidadService;
	
	private Logger log = LoggerFactory.getLogger(UnidadController.class.getName());
	
	@PostMapping("/insertar")
	public ResponseEntity<?> insertar(@RequestBody UnidadDTO unidadDTO){
		log.debug("UnidadController.insertar() ==================> INICIO <==================");
		try {
			
			UnidadDTO retorno = unidadService.insertar(unidadDTO);
			return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.badRequest().body("Ha ocurrido una exception: " + ex.getMessage());
		}finally {
			log.debug("UnidadController.insertar() ==================> FIN <==================");
		}
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminar(@PathVariable("id") Long idCodUnidad){
		log.debug("UnidadController.eliminar() ==================> INICIO <==================");
		try {
			
			unidadService.eliminar(idCodUnidad);
			return ResponseEntity.status(HttpStatus.CREATED).body("Registro eliminado satisfactoriamente");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.badRequest().body("Ha ocurrido una exception: " + ex.getMessage());
		}finally {
			log.debug("UnidadController.eliminar() ==================> FIN <==================");
		}
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		log.debug("UnidadController.getAll() ==================> INICIO <==================");
		try {
			
			List<UnidadDTO> listaRetorno = unidadService.getAll();
			return ResponseEntity.status(HttpStatus.CREATED).body(listaRetorno);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.badRequest().body("Ha ocurrido una exception: " + ex.getMessage());
		}finally {
			log.debug("UnidadController.getAll() ==================> FIN <==================");
		}
		
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody UnidadDTO unidadDTO){
		log.debug("UnidadController.update() ==================> INICIO <==================");
		try {
			
			unidadService.update(unidadDTO);
			return ResponseEntity.status(HttpStatus.CREATED).body("Grabacion realizada correctamente");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.badRequest().body("Ha ocurrido una exception: " + ex.getMessage());
		}finally {
			log.debug("UnidadController.update() ==================> FIN <==================");
		}
		
	}
}
