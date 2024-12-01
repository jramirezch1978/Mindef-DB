package com.mindefdb.services.transactionals;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Order {
	private String nroOrder;
	private String Cliente;
	private String codMoneda;
	private Date fecCompra;
	private Float payment;
	
}
