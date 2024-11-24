package com.mindefdb.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindefdb.dominio.model.Unidad;
import com.mindefdb.dtos.UnidadDTO;
import com.mindefdb.repository.IUnidadRepository;
import com.mindefdb.services.IUnidadService;
import com.mindefdb.transformers.UnidadTransformer;

@Service
public class UnidadServiceImpl implements IUnidadService{
	
	@Autowired
	private IUnidadRepository unidadRepository;
	
	@Override
	public UnidadDTO insertar(UnidadDTO unidadDto) {
		
		Unidad unidad = UnidadTransformer.parserDtoToModel(unidadDto);
		
		unidad.setCreadoPor("SYSTEM");
		unidad.setFechaCreacion(LocalDateTime.now());
		
		unidadRepository.save(unidad);
		
		UnidadDTO dtoRetorno = UnidadTransformer.parserModelToDto(unidad);
		
		return dtoRetorno;
	}
	
	@Override
	public UnidadDTO update(UnidadDTO unidadDto) {
		
		Unidad unidad = UnidadTransformer.parserDtoToModel(unidadDto);
		
		unidad.setModificadoPor("SYSTEM");
		unidad.setFechaModificacion(LocalDateTime.now());
		
		unidadRepository.save(unidad);
		
		UnidadDTO dtoRetorno = UnidadTransformer.parserModelToDto(unidad);
		
		return dtoRetorno;
	}

	@Override
	public List<UnidadDTO> getAll() {
		List<Unidad> lista = unidadRepository.findAll();
		
		List<UnidadDTO> listaRetorno = UnidadTransformer.parserModelToDTO(lista);
		
		return listaRetorno;
	}

	@Override
	public void eliminar(Long idCodUnidad) {
		
		unidadRepository.deleteById(idCodUnidad);
		
	}

}
