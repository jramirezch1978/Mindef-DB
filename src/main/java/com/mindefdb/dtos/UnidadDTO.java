package com.mindefdb.dtos;


import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UnidadDTO {
	private Long idCodUnidad;
	private String nombre;
	private String sigla;
    private String flagEstado;
    
	private String creadoPor;
	private LocalDateTime fechaCreacion;
	private String modificadoPor;
	private LocalDateTime fechaModificacion;
}
