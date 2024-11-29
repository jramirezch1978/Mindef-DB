package com.mindefdb.transformers;

import java.util.ArrayList;
import java.util.List;

import com.mindefdb.dominio.model.Unidad;
import com.mindefdb.dtos.UnidadDTO;

public class UnidadTransformer {

	public static Unidad parserDtoToModel(UnidadDTO unidadDto) {
		Unidad unidad = new Unidad();
		
		if(unidadDto.getIdCodUnidad() != null) {
			unidad.setIdCodUnidad(unidadDto.getIdCodUnidad());
		}
		
		unidad.setNombre(unidadDto.getNombre());
		unidad.setSigla(unidadDto.getSigla());
		unidad.setFlagEstado("1");
		
		return unidad;
	}

	public static UnidadDTO parserModelToDto(Unidad unidad) {
		UnidadDTO unidadDto = new UnidadDTO();
		
		unidadDto.setNombre(unidad.getNombre());
		unidadDto.setSigla(unidad.getSigla());
		unidadDto.setFlagEstado(unidad.getFlagEstado().getFlagEstado());
		unidadDto.setIdCodUnidad(unidad.getIdCodUnidad());
		
		
		unidadDto.setCreadoPor(unidad.getCreadoPor());
		unidadDto.setFechaCreacion(unidad.getFechaCreacion());
		unidadDto.setModificadoPor(unidad.getModificadoPor());
		unidadDto.setFechaModificacion(unidad.getFechaModificacion());
		
		return unidadDto;
	}

	public static List<UnidadDTO> parserModelToDTO(List<Unidad> lista) {
		List<UnidadDTO>listaRetorno = new ArrayList<>();
		
		for(Unidad unidad : lista) {
			listaRetorno.add(UnidadTransformer.parserModelToDto(unidad));
		}
		
		return listaRetorno;
	}

}
