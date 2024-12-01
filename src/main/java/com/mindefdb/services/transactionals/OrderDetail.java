package com.mindefdb.services.transactionals;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class OrderDetail {
	private Long id;
	private String Articulo;
	private Double Cantidad;
}
