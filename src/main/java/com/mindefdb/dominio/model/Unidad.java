package com.mindefdb.dominio.model;

import java.io.Serializable;

import com.mindefdb.dominio.model.ancestor.FlagEstado;
import com.mindefdb.dominio.model.auditable.DataAuditable;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "t_m_unidad",
	uniqueConstraints = {
        @UniqueConstraint(name = "PK_T_M_UNIDAD", columnNames = "id_cod_unidad")
	})
public class Unidad extends DataAuditable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3540598256864918973L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_cod_unidad", columnDefinition = "NUMERIC(8,0)")
	private Long idCodUnidad;
	
	@Column(name ="nombre", length = 150, nullable = false)
	private String nombre;
	
	@Column(name ="sigla", length = 20, nullable = false)
	private String sigla;
	
	@Embedded
    private FlagEstado flagEstado;

}
