package com.mindefdb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindefdb.services.ICargoService;


@RestController
@RequestMapping("api/cargos")
public class CargoController {
	@Autowired 
	private ICargoService cargoService;
}
