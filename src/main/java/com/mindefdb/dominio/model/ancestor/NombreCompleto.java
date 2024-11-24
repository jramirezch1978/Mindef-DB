package com.mindefdb.dominio.model.ancestor;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class NombreCompleto {
	@Column(name ="primer_nombre", length = 150, nullable = false )
	private String primerNombre;
	
	@Column(name ="segundo_nombre", length = 150, nullable = false )
	private String segundoNombre;

	@Column(name ="apellido_paterno", length = 150, nullable = false)
	private String apellidoPaterno;
	
	@Column(name ="apellido_materno", length = 150, nullable = false)
	private String apellidoMaterno;
}
