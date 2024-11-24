package com.mindefdb.dominio.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "t_t_chofer")
public class Chofer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5616837701178813239L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_chofer")
	private Long idChofer;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name ="apellido_materno")
	private String apellidoMaterno;
	
	@Column(name ="celular")
	private String celular;
	
	@Column(name ="nro_licencia")
	private String nroLicencia;
	
	@Column(name ="dni")
	private String dni;
	
	@Column(name ="fecha_vigente")
	private Date fechaVigente;
	
	@Column(name ="observaciones")
	private String observaciones;

	
	@Column(name ="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_cod_unidad")
	private Unidad unidad;

}
