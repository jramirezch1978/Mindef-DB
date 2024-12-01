package com.mindefdb.dtos;

import com.mindefdb.dominio.embedables.FlagEstado;
import com.mindefdb.dtos.ancestors.AncestorDTO;

import lombok.Data;

@Data
public class CargoDTO extends AncestorDTO{
	private Long idCargo;
	private String nombreCargo;
    private FlagEstado flagEstado;
}
