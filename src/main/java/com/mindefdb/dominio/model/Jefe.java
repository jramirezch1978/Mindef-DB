package com.mindefdb.dominio.model;

import java.io.Serializable;

import com.mindefdb.dominio.model.ancestor.Address;
import com.mindefdb.dominio.model.ancestor.FlagEstado;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "t_m_jefe",
	uniqueConstraints = {
        @UniqueConstraint(name = "PK_T_M_JEFE", columnNames = "id_jefe")
	})
public class Jefe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4490349802390067246L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_jefe", columnDefinition = "NUMERIC(8,0)")
	private Long idJefe;
	
	@Column(name ="nombre", length = 150, nullable = false )
	private String nombre;
	
	@Column(name ="apellido_paterno", length = 150, nullable = false)
	private String apellidoPaterno;
	
	@Column(name ="apellido_materno", length = 150, nullable = false)
	private String apellidoMaterno;
	
	@Column(name ="correo", length = 100, nullable = false)
	private String correo;
	
	@Embedded
    private FlagEstado flagEstado;
	
	@Embedded
    private Address direccion;
	
	//Relaciones o Llaves foraneas
	@ManyToOne
	@JoinColumn(name="id_cod_cargo", columnDefinition = "NUMERIC(8,0)")
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name="id_cod_unidad", columnDefinition = "NUMERIC(8,0)")
	private Unidad unidad;
	
}
