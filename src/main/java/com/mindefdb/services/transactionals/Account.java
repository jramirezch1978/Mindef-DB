package com.mindefdb.services.transactionals;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Account {
	private Long Id;
	private String nombre;
	private String apellidos;
	private String razonSocial;
	private String direccion;
	private BigDecimal balance;
	
	public void debit(BigDecimal amount) {
		// TODO Auto-generated method stub
		
	}
	public void credit(BigDecimal amount) {
		// TODO Auto-generated method stub
		
	}

}
