package com.mindefdb.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindefdb.dominio.model.Cargo;
import com.mindefdb.dominio.model.Unidad;
import com.mindefdb.dtos.CargoDTO;
import com.mindefdb.dtos.UnidadDTO;
import com.mindefdb.services.ICargoService;
import com.mindefdb.transformers.impl.UnidadTransformer;

@Service
@Transactional
public class CargoService implements ICargoService{

	@Override
	public CargoDTO insertar(CargoDTO cargoDto) {
		Cargo cargo = CargoTransformer.parserDtoToModel(cargoDto);
		
		unidad.setCreadoPor("SYSTEM");
		unidad.setFechaCreacion(LocalDateTime.now());
		
		unidadRepository.save(unidad);
		
		UnidadDTO dtoRetorno = UnidadTransformer.parserModelToDto(unidad);
		
		return dtoRetorno;
	}

	@Override
	public CargoDTO update(CargoDTO cargoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CargoDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long idCodCargo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CargoDTO getById(Long idCodCargo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
