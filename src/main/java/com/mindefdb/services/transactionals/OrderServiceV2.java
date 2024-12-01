package com.mindefdb.services.transactionals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceV2 {
	
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private PaymentService paymentService;
    
    public Order processOrder(Order order) {
        // Todo esto es una sola transacción
        validateOrder(order);
        
        Order savedOrder = orderRepository.save(order);
        paymentService.processPayment(order.getPayment());
        
        return savedOrder;
    }

	private void validateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
}