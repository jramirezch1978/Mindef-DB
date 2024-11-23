package com.mindefdb.dominio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "t_m_jefe")
public class Jefe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4490349802390067246L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_jefe")
	private Long idJefe;
	
	@Column(name ="nombre" , length = 100, nullable = false)
	private String nombre;
	
	@Column(name ="apellido_paterno", length = 100, nullable = false)
	private String apellidoPaterno;
	
	@Column(name ="apellido_materno")
	private String apellidoMaterno;
	
	@Column(name ="cargo")
	private String cargo;
	
	@Column(name ="correo")
	private String correo;
	
	@Column(name ="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_cod_unidad")
	private Unidad unidad;
	
	
}
