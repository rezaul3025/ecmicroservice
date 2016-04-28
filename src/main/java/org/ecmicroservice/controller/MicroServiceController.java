package org.ecmicroservice.controller;

import org.ecmicroservice.core.Order;
import org.ecmicroservice.service.EcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value="/ecms")
public class MicroServiceController {
	
	@Autowired
	private EcService ecService;
	
	@RequestMapping(value="/order/{id}", method = RequestMethod.GET)
	public Order getOrder(@PathVariable("id") Long id){
		return ecService.getOrderDetails(id);
	}
}
