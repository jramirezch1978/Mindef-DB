package com.mindefdb.dtos;

import java.time.LocalDateTime;

import com.mindefdb.dtos.ancestors.AncestorDTO;

import lombok.Data;

@Data
public class CargoDTO extends AncestorDTO{
	private Long idCargo;
	private String nombreCargo;
    private String flagEstado;
    
    private String creadoPor;
	private LocalDateTime fechaCreacion;
	private String modificadoPor;
	private LocalDateTime fechaModificacion;
}
