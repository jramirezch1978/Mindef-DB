package com.mindefdb.dtos;


import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UnidadDTO {
	private Long idCodUnidad;
	
	@Size(min = 5, max = 150, message = "Nombre debe tener entre 2 y 50 caracteres")
	private String nombre;
	
	@NotNull
	private String sigla;
	
	@NotNull
	@Size(min = 1, max = 1, message = "El Flag de estado solo debe ser de 1 caracter")
    private String flagEstado;
    
	private String creadoPor;
	private LocalDateTime fechaCreacion;
	private String modificadoPor;
	private LocalDateTime fechaModificacion;
}
