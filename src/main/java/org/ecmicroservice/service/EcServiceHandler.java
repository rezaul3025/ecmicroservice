package org.ecmicroservice.service;

import org.ecmicroservice.core.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EcServiceHandler implements EcService {
	
	private static final String ORDER_BASE_URL="/order/getdetails";
	
	@Value("${micro.order.service.host}")
	private String orderServiceHost;
	
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public Order getOrderDetails(Long id) {
		return restTemplate.getForObject(orderServiceHost+ORDER_BASE_URL+"/"+id, Order.class);
	}
	
}
