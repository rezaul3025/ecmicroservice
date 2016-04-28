package org.ecmicroservice.service;

import org.ecmicroservice.core.Order;

public interface EcService {
	Order getOrderDetails(Long id);
}
