package com.mindefdb.dominio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "t_m_unidad")
public class Unidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3540598256864918973L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCodUnidad;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="sigla")
	private String sigla;
	
	@Column(name ="estado")
	private String estado;

}
