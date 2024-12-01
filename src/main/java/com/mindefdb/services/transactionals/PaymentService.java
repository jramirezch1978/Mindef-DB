package com.mindefdb.services.transactionals;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {

	@Transactional(timeout = 20)
	public void processPayment(Float payment) {
		Date fechaHoraInicio = new Date();
		
		//Todo el proceso
		try {
			
		}catch(Exception ex) {
			
		}finally {
			Date fechaHoraFin = new Date();
			
			//Guardar en un log o tabla la diferencia de ambos
		}
		
		
	}

}
