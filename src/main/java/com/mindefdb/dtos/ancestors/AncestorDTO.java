package com.mindefdb.dtos.ancestors;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AncestorDTO {
	private String creadoPor;
	private LocalDateTime fechaCreacion;
	private String modificadoPor;
	private LocalDateTime fechaModificacion;
}
